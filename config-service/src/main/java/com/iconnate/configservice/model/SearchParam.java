
package com.iconnate.configservice.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author samar
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "label", "type", "pattern", "isMandatory", "searchClause" })
public class SearchParam implements Serializable {

	@JsonProperty("name")
	private String name;
	@JsonProperty("label")
	private String label;
	@JsonProperty("type")
	private String type;
	@JsonProperty("pattern")
	private String pattern;
	@JsonProperty("isMandatory")
	private Boolean isMandatory;
	@JsonProperty("searchClause")
	private String searchClause;
	private static final long serialVersionUID = -1790318236778674905L;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public SearchParam withName(String name) {
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

	public SearchParam withLabel(String label) {
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

	public SearchParam withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("pattern")
	public String getPattern() {
		return pattern;
	}

	@JsonProperty("pattern")
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public SearchParam withPattern(String pattern) {
		this.pattern = pattern;
		return this;
	}

	@JsonProperty("isMandatory")
	public Boolean getIsMandatory() {
		return isMandatory;
	}

	@JsonProperty("isMandatory")
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public SearchParam withIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
		return this;
	}

	@JsonProperty("searchClause")
	public String getSearchClause() {
		return searchClause;
	}

	@JsonProperty("searchClause")
	public void setSearchClause(String searchClause) {
		this.searchClause = searchClause;
	}

	public SearchParam withSearchClause(String searchClause) {
		this.searchClause = searchClause;
		return this;
	}

}
