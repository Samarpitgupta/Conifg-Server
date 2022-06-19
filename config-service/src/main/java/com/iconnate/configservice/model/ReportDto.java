/**
 * 
 */
package com.iconnate.configservice.model;

import java.util.List;
import java.util.Map;

/**
 * @author samar
 *
 */
public class ReportDto {

	private String reportName;

	private String dbFlag;

	private String serviceName;

	private Map<String, Object> values; // key : field name, value: field value

	private List<String> fields;

	private Long tenantId;

	private String orderByFieldName;

	private String orderType;

	private String groupByFieldName;

	private Map<String, String> mappings;

	public Map<String, String> getMappings() {
		return mappings;
	}

	public void setMappings(Map<String, String> mappings) {
		this.mappings = mappings;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Map<String, Object> getValues() {
		return values;
	}

	public void setValues(Map<String, Object> values) {
		this.values = values;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getOrderByFieldName() {
		return orderByFieldName;
	}

	public String getDbFlag() {
		return dbFlag;
	}

	public void setDbFlag(String dbFlag) {
		this.dbFlag = dbFlag;
	}

	public void setOrderByFieldName(String orderByFieldName) {
		this.orderByFieldName = orderByFieldName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getGroupByFieldName() {
		return groupByFieldName;
	}

	public void setGroupByFieldName(String groupByFieldName) {
		this.groupByFieldName = groupByFieldName;
	}

}
