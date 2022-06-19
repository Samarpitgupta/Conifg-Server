/**
 * 
 */
package com.iconnate.configservice.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iconnate.configservice.model.ReportConfigModel;
import com.iconnate.configservice.model.ReportDto;
import com.iconnate.configservice.service.ConfigService;

/**
 * @author samar
 *
 */  
@RestController
@RequestMapping("/config")
public class ConfigController {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(ConfigController.class);

	@Autowired
	ConfigService configService;

	@Value("${db.flag}")
	private String dbFlag;

	@PostMapping(path = "/getReportConfig")
	public ResponseEntity<Object> getReport(@RequestBody ReportDto reportDto) {
		if (reportDto.getReportName().isEmpty() || reportDto.getReportName() == null
				|| reportDto.getServiceName() == null || reportDto.getServiceName().isEmpty()) {
			return new ResponseEntity<>(new ReportConfigModel(), HttpStatus.OK);
		}
		// needs to rewrite to do DB checks
		if (dbFlag.equals("SQL")) {
			return new ResponseEntity<>(configService.getReportConfig(reportDto), HttpStatus.OK);
		} else if (dbFlag.equals("ES")) {
			return new ResponseEntity<>(configService.getESReportConfig(reportDto), HttpStatus.OK);
		}

		return new ResponseEntity<>(new ReportConfigModel(), HttpStatus.OK);
	}
}
