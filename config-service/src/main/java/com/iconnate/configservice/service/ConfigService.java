/**
 * 
 */
package com.iconnate.configservice.service;

import com.iconnate.configservice.elasticsearch.model.ESReportConfigModel;
import com.iconnate.configservice.model.ReportConfigModel;
import com.iconnate.configservice.model.ReportDto;

/**
 * @author samar
 *
 */
public interface ConfigService {
	public ReportConfigModel getReportConfig(ReportDto reportDto);
	
	public ESReportConfigModel getESReportConfig(ReportDto reportDto);
	
}
