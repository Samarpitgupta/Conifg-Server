/**
 * 
 */
package com.iconnate.configservice.service.imple;

import java.io.File;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.iconnate.configservice.elasticsearch.model.ESReportConfigModel;
import com.iconnate.configservice.helper.Constants;
import com.iconnate.configservice.helper.ReportApplicationRunner;
import com.iconnate.configservice.model.ReportConfigModel;
import com.iconnate.configservice.model.ReportDto;
import com.iconnate.configservice.service.ConfigService;

/**
 * @author samar
 *
 */
@Service(value = "configService")
public class ConfigServiceImple implements ConfigService {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(ConfigServiceImple.class);
	@Value("${report.config.path}")
	public String fileDirectory;

	@Override
	public ReportConfigModel getReportConfig(ReportDto reportDto) {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		ReportConfigModel configModel = new ReportConfigModel();
		try {
			configModel = mapper.readValue(
					new File(fileDirectory + Constants.SLASH
							+ ReportApplicationRunner.getFileServiceMap().get(reportDto.getServiceName())),
					ReportConfigModel.class);
		} catch (Exception e) {
			logger.info("Encountered an Exception while mapping YAML properties to config model {}", e.getMessage());
		}
		return configModel;
	}

	@Override
	public ESReportConfigModel getESReportConfig(ReportDto reportDto) {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		ESReportConfigModel configModel = new ESReportConfigModel();
		try {
			configModel = mapper.readValue(
					new File(fileDirectory + Constants.SLASH
							+ ReportApplicationRunner.getFileServiceMap().get(reportDto.getServiceName())),
					ESReportConfigModel.class);
		} catch (Exception e) {
			logger.info("Encountered an Exception while mapping YAML properties to es report config model 1{}", e.getMessage());
		}
		return configModel;
	}

}
