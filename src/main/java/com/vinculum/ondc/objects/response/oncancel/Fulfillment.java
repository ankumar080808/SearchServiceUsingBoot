
package com.vinculum.ondc.objects.response.oncancel;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "@ondc/org/provider_name",
    "state",
    "type",
    "tracking",
    "start",
    "end",
    "tags"
})
@Generated("jsonschema2pojo")
public class Fulfillment implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("@ondc/org/provider_name")
    private String ondcOrgProviderName;
    @JsonProperty("state")
    private State state;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tracking")
    private boolean tracking;
    @JsonProperty("start")
    private Start start;
    @JsonProperty("end")
    private End end;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3100056728880907687L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param ondcOrgProviderName
     * @param start
     * @param end
     * @param id
     * @param state
     * @param type
     * @param tracking
     * @param tags
     */
    public Fulfillment(String id, String ondcOrgProviderName, State state, String type, boolean tracking, Start start, End end, List<Tag> tags) {
        super();
        this.id = id;
        this.ondcOrgProviderName = ondcOrgProviderName;
        this.state = state;
        this.type = type;
        this.tracking = tracking;
        this.start = start;
        this.end = end;
        this.tags = tags;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("@ondc/org/provider_name")
    public String getOndcOrgProviderName() {
        return ondcOrgProviderName;
    }

    @JsonProperty("@ondc/org/provider_name")
    public void setOndcOrgProviderName(String ondcOrgProviderName) {
        this.ondcOrgProviderName = ondcOrgProviderName;
    }

    @JsonProperty("state")
    public State getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("tracking")
    public boolean isTracking() {
        return tracking;
    }

    @JsonProperty("tracking")
    public void setTracking(boolean tracking) {
        this.tracking = tracking;
    }

    @JsonProperty("start")
    public Start getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Start start) {
        this.start = start;
    }

    @JsonProperty("end")
    public End getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(End end) {
        this.end = end;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
