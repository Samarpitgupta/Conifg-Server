
package com.iconnate.configservice.elasticsearch.model;

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
@JsonPropertyOrder({
    "name",
    "source",
    "esIndex",
    "esDocType",
    "esQueries",
    "restrictedFields",
    "numberOfRecords"
})
public class Report implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("source")
    private String source;
    @JsonProperty("esIndex")
    private String esIndex;
    @JsonProperty("esDocType")
    private String esDocType;
    @JsonProperty("esQueries")
    private EsQueries esQueries;
    @JsonProperty("restrictedFields")
    private List<RestrictedField> restrictedFields = null;
    @JsonProperty("numberOfRecords")
    private Long numberOfRecords;
    private final static long serialVersionUID = 4729446276948663857L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Report withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Report withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("esIndex")
    public String getEsIndex() {
        return esIndex;
    }

    @JsonProperty("esIndex")
    public void setEsIndex(String esIndex) {
        this.esIndex = esIndex;
    }

    public Report withEsIndex(String esIndex) {
        this.esIndex = esIndex;
        return this;
    }

    @JsonProperty("esDocType")
    public String getEsDocType() {
        return esDocType;
    }

    @JsonProperty("esDocType")
    public void setEsDocType(String esDocType) {
        this.esDocType = esDocType;
    }

    public Report withEsDocType(String esDocType) {
        this.esDocType = esDocType;
        return this;
    }

    @JsonProperty("esQueries")
    public EsQueries getEsQueries() {
        return esQueries;
    }

    @JsonProperty("esQueries")
    public void setEsQueries(EsQueries esQueries) {
        this.esQueries = esQueries;
    }

    public Report withEsQueries(EsQueries esQueries) {
        this.esQueries = esQueries;
        return this;
    }

    @JsonProperty("restrictedFields")
    public List<RestrictedField> getRestrictedFields() {
        return restrictedFields;
    }

    @JsonProperty("restrictedFields")
    public void setRestrictedFields(List<RestrictedField> restrictedFields) {
        this.restrictedFields = restrictedFields;
    }

    public Report withRestrictedFields(List<RestrictedField> restrictedFields) {
        this.restrictedFields = restrictedFields;
        return this;
    }

    @JsonProperty("numberOfRecords")
    public Long getNumberOfRecords() {
        return numberOfRecords;
    }

    @JsonProperty("numberOfRecords")
    public void setNumberOfRecords(Long numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    public Report withNumberOfRecords(Long numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
        return this;
    }

}
