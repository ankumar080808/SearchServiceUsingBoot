
package com.vinculum.ondc.objects.response.onsearch.homekitchen;

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
    private final static long serialVersionUID = 7725306883127355165L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Time__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("days");
        sb.append('=');
        sb.append(((this.days == null)?"<null>":this.days));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null)?"<null>":this.range));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
