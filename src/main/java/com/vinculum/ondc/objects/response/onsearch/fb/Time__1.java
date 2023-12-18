package com.vinculum.ondc.objects.response.onsearch.fb;

import java.io.Serializable;
import java.util.LinkedHashMap;
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
    "label",
    "timestamp",
    "days",
    "schedule",
    "range"
})
@Generated("jsonschema2pojo")
public class Time__1 implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("days")
    private String days;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("range")
    private Range range;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 359850835266886327L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Time__1() {
    }

    /**
     * 
     * @param schedule
     * @param days
     * @param range
     * @param label
     * @param timestamp
     */
    public Time__1(String label, String timestamp, String days, Schedule schedule, Range range) {
        super();
        this.label = label;
        this.timestamp = timestamp;
        this.days = days;
        this.schedule = schedule;
        this.range = range;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("days")
    public String getDays() {
        return days;
    }

    @JsonProperty("days")
    public void setDays(String days) {
        this.days = days;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Range range) {
        this.range = range;
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
