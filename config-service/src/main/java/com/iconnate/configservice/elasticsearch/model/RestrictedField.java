
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
    "role",
    "fields"
})
public class RestrictedField implements Serializable
{

    @JsonProperty("role")
    private Long role;
    @JsonProperty("fields")
    private List<String> fields = null;
    private final static long serialVersionUID = -5095402147241676200L;

    @JsonProperty("role")
    public Long getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(Long role) {
        this.role = role;
    }

    public RestrictedField withRole(Long role) {
        this.role = role;
        return this;
    }

    @JsonProperty("fields")
    public List<String> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public RestrictedField withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

}
