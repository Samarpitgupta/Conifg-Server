
package com.iconnate.configservice.elasticsearch.model;

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
public class ESReportConfigModel implements Serializable
{

    @JsonProperty("ReportDefinitions")
    private ReportDefinitions reportDefinitions;
    private final static long serialVersionUID = -2052265056219139030L;

    @JsonProperty("ReportDefinitions")
    public ReportDefinitions getReportDefinitions() {
        return reportDefinitions;
    }

    @JsonProperty("ReportDefinitions")
    public void setReportDefinitions(ReportDefinitions reportDefinitions) {
        this.reportDefinitions = reportDefinitions;
    }

    public ESReportConfigModel withReportDefinitions(ReportDefinitions reportDefinitions) {
        this.reportDefinitions = reportDefinitions;
        return this;
    }

}
