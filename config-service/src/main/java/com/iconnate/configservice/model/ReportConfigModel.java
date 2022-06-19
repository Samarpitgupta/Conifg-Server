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
@JsonPropertyOrder({
    "ReportDefinitions"
})
public class ReportConfigModel implements Serializable
{

    @JsonProperty("ReportDefinitions")
    private ReportDefinitions reportDefinitions;
    private static final long serialVersionUID = 1370922168583246101L;

    @JsonProperty("ReportDefinitions")
    public ReportDefinitions getReportDefinitions() {
        return reportDefinitions;
    }

    @JsonProperty("ReportDefinitions")
    public void setReportDefinitions(ReportDefinitions reportDefinitions) {
        this.reportDefinitions = reportDefinitions;
    }

    public ReportConfigModel withReportDefinitions(ReportDefinitions reportDefinitions) {
        this.reportDefinitions = reportDefinitions;
        return this;
    }

}
