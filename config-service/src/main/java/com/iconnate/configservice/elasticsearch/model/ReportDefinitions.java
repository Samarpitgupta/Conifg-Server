
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
    "serviceName",
    "roles",
    "report"
})
public class ReportDefinitions implements Serializable
{

    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("roles")
    private List<Long> roles = null;
    @JsonProperty("report")
    private Report report;
    private final static long serialVersionUID = -4774693062470054912L;

    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ReportDefinitions withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @JsonProperty("roles")
    public List<Long> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }

    public ReportDefinitions withRoles(List<Long> roles) {
        this.roles = roles;
        return this;
    }

    @JsonProperty("report")
    public Report getReport() {
        return report;
    }

    @JsonProperty("report")
    public void setReport(Report report) {
        this.report = report;
    }

    public ReportDefinitions withReport(Report report) {
        this.report = report;
        return this;
    }

}
