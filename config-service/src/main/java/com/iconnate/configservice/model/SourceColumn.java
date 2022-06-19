
package com.iconnate.configservice.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author samar
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "label", "type", "roleIds" })
public class SourceColumn implements Serializable {

	@JsonProperty("name")
	private String name;
	@JsonProperty("label")
	private String label;
	@JsonProperty("type")
	private String type;
	@JsonProperty("roleIds")
	private transient List<Long> roleIds = null;
	private static final long serialVersionUID = 1420286002306303572L;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public SourceColumn withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("label")
	public String getLabel() {
		return label;
	}

	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}

	public SourceColumn withLabel(String label) {
		this.label = label;
		return this;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public SourceColumn withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("roleIds")
	public List<Long> getRoleIds() {
		return roleIds;
	}

	@JsonProperty("roleIds")
	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public SourceColumn withRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
		return this;
	}

}
