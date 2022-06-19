
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
    "query",
    "role"
})
public class EsQuery implements Serializable
{

    @JsonProperty("query")
    private String query;
    @JsonProperty("role")
    private Long role;
    private static final long serialVersionUID = -3043694600068040909L;

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public EsQuery withQuery(String query) {
        this.query = query;
        return this;
    }

    @JsonProperty("role")
    public Long getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(Long role) {
        this.role = role;
    }

    public EsQuery withRole(Long role) {
        this.role = role;
        return this;
    }

}
