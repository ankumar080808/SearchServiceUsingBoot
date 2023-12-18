
package com.vinculum.ondc.objects.response.onconfirm.multipleorders;

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
    "id",
    "@ondc/org/provider_name",
    "state",
    "type",
    "tracking",
    "start",
    "end"
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1810694073783333126L;

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
     */
    public Fulfillment(String id, String ondcOrgProviderName, State state, String type, boolean tracking, Start start, End end) {
        super();
        this.id = id;
        this.ondcOrgProviderName = ondcOrgProviderName;
        this.state = state;
        this.type = type;
        this.tracking = tracking;
        this.start = start;
        this.end = end;
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
        sb.append(Fulfillment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ondcOrgProviderName");
        sb.append('=');
        sb.append(((this.ondcOrgProviderName == null)?"<null>":this.ondcOrgProviderName));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("tracking");
        sb.append('=');
        sb.append(this.tracking);
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
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
