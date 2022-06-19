/**
 * 
 */
package com.iconnate.configservice.helper;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author samar
 *
 */
@Component
public class ReportApplicationRunner implements ApplicationRunner {

	public static final Logger log = LoggerFactory.getLogger(ReportApplicationRunner.class);

	@Autowired
	public ResourceLoader resourceLoader;

	@Value("${report.config.path}")
	public String fileDirectory;

	@Value("${report.config.path}")
	public String masterConfigUrl;

	private static Map<String, String> fileServiceMap = new HashMap<>();

	private static Map<String, Map<String, Object>> masterConfigMap = new HashMap<>();

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			log.info("Reading data files from: {} ", fileDirectory);
			readDirectory(fileDirectory);
		} catch (Exception e) {
			log.error("Exception while loading yaml files: ", e);
		}
	}

	private static HashMap<String, Object> jdbcTemplateHashMap = new HashMap<>();

	public static Map<String, Object> getJdbcTemplateMap() {
		return jdbcTemplateHashMap;
	}

	public void readDirectory(String path) {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				log.info("File {}", listOfFiles[i].getName());
				File file = listOfFiles[i];
				String name = file.getName();
				String[] fileName = name.split("[.]");
				if (fileName[fileName.length - 1].equals("yml") || fileName[fileName.length - 1].equals("yaml")) {
					log.info("Reading yaml file....:- {}", name);
					try {
						buildFileServiceMap( file.getName());
					} catch (Exception e) {
						log.error("Exception while fetching service map for: ");
					}
				} else if (fileName[fileName.length - 1].equals("json")) {
					try {
						buildFileServiceMap( file.getName());
					} catch (Exception e) {
						log.error("Exception while fetching service map for: ");
					}
				} else {
					log.info("file is not of a valid type please change and retry");
					log.info("Note: file can either be .yml/.yaml or .json");
				}

			} else if (listOfFiles[i].isDirectory()) {
				log.info("Directory {}", listOfFiles[i].getName());
				readDirectory(listOfFiles[i].getAbsolutePath());
			}
		}
		log.info("fileServiceMap: {}", fileServiceMap);
	}

	private void buildFileServiceMap(String fileName) {
		String[] serviceNames = fileName.split("-");
		fileServiceMap.put(serviceNames[0], fileName);
	}

	public static Map<String, String> getFileServiceMap() {
		return fileServiceMap;
	}

	public void prepareMasterConfigMap(Map<String, Object> map) {
		ObjectMapper objectMapper = new ObjectMapper();

		Set<String> moduleKeys = map.keySet();
		Iterator<String> moduleKeyIterator = moduleKeys.iterator();
		String masterName = null;
		Map<String, Object> masterDataJsonArray = null;
		while (moduleKeyIterator.hasNext()) {
			masterName = moduleKeyIterator.next();

			try {
				masterDataJsonArray = JsonPath.read(objectMapper.writeValueAsString(map.get(masterName)), "$");
			} catch (JsonProcessingException e) {
				log.info("Encounter an exception while preparing master config map: {}", e.getMessage());
			}
			masterConfigMap.put(masterName, masterDataJsonArray);
		}
		log.info("MasterConfigMap: {}", masterConfigMap);
	}

	public static Map<String, Map<String, Object>> getMasterConfigMap() {
		return masterConfigMap;
	}
}
