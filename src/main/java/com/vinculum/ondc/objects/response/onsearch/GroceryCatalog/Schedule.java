
package com.vinculum.ondc.objects.response.onsearch.GroceryCatalog;

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
    "holidays",
    "frequency",
    "times"
})
@Generated("jsonschema2pojo")
public class Schedule implements Serializable
{

    @JsonProperty("holidays")
    private List<String> holidays;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("times")
    private List<String> times;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1458018542222954791L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Schedule() {
    }

    /**
     * 
     * @param times
     * @param holidays
     * @param frequency
     */
    public Schedule(List<String> holidays, String frequency, List<String> times) {
        super();
        this.holidays = holidays;
        this.frequency = frequency;
        this.times = times;
    }

    @JsonProperty("holidays")
    public List<String> getHolidays() {
        return holidays;
    }

    @JsonProperty("holidays")
    public void setHolidays(List<String> holidays) {
        this.holidays = holidays;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("times")
    public List<String> getTimes() {
        return times;
    }

    @JsonProperty("times")
    public void setTimes(List<String> times) {
        this.times = times;
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
        sb.append(Schedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holidays");
        sb.append('=');
        sb.append(((this.holidays == null)?"<null>":this.holidays));
        sb.append(',');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("times");
        sb.append('=');
        sb.append(((this.times == null)?"<null>":this.times));
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
