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
@JsonPropertyOrder({
    "name",
    "source",
    "queries",
    "sourceColumns",
    "searchParams",
    "orderBy",
    "limit",
    "insight",
    "comment"
})
public class Report implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("source")
    private String source;
    @JsonProperty("queries")
    private Queries queries;
    @JsonProperty("sourceColumns")
    private transient List<SourceColumn> sourceColumns = null;
    @JsonProperty("searchParams")
    private transient List<SearchParam> searchParams = null;
    @JsonProperty("orderBy")
    private String orderBy;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("insight")
    private Insight insight;
    @JsonProperty("comment")
    private String comment;
    private static final long serialVersionUID = -916160304373231846L;

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

    @JsonProperty("queries")
    public Queries getQueries() {
        return queries;
    }

    @JsonProperty("queries")
    public void setQueries(Queries queries) {
        this.queries = queries;
    }

    public Report withQueries(Queries queries) {
        this.queries = queries;
        return this;
    }

    @JsonProperty("sourceColumns")
    public List<SourceColumn> getSourceColumns() {
        return sourceColumns;
    }

    @JsonProperty("sourceColumns")
    public void setSourceColumns(List<SourceColumn> sourceColumns) {
        this.sourceColumns = sourceColumns;
    }

    public Report withSourceColumns(List<SourceColumn> sourceColumns) {
        this.sourceColumns = sourceColumns;
        return this;
    }

    @JsonProperty("searchParams")
    public List<SearchParam> getSearchParams() {
        return searchParams;
    }

    @JsonProperty("searchParams")
    public void setSearchParams(List<SearchParam> searchParams) {
        this.searchParams = searchParams;
    }

    public Report withSearchParams(List<SearchParam> searchParams) {
        this.searchParams = searchParams;
        return this;
    }

    @JsonProperty("orderBy")
    public String getOrderBy() {
        return orderBy;
    }

    @JsonProperty("orderBy")
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Report withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Report withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("insight")
    public Insight getInsight() {
        return insight;
    }

    @JsonProperty("insight")
    public void setInsight(Insight insight) {
        this.insight = insight;
    }

    public Report withInsight(Insight insight) {
        this.insight = insight;
        return this;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Report withComment(String comment) {
        this.comment = comment;
        return this;
    }

}
