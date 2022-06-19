
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
    "query"
})
public class Queries implements Serializable
{

    @JsonProperty("query")
    private String query;
    private static final long serialVersionUID = 6314734054397966163L;

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public Queries withQuery(String query) {
        this.query = query;
        return this;
    }

}
