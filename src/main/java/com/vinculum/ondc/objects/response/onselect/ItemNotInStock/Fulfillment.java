
package com.vinculum.ondc.objects.response.onselect.ItemNotInStock;

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
    "tracking",
    "@ondc/org/category",
    "@ondc/org/TAT",
    "state"
})
@Generated("jsonschema2pojo")
public class Fulfillment implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("@ondc/org/provider_name")
    private String ondcOrgProviderName;
    @JsonProperty("tracking")
    private boolean tracking;
    @JsonProperty("@ondc/org/category")
    private String ondcOrgCategory;
    @JsonProperty("@ondc/org/TAT")
    private String ondcOrgTAT;
    @JsonProperty("state")
    private State state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1032555771094090555L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param ondcOrgProviderName
     * @param ondcOrgTAT
     * @param ondcOrgCategory
     * @param id
     * @param state
     * @param tracking
     */
    public Fulfillment(String id, String ondcOrgProviderName, boolean tracking, String ondcOrgCategory, String ondcOrgTAT, State state) {
        super();
        this.id = id;
        this.ondcOrgProviderName = ondcOrgProviderName;
        this.tracking = tracking;
        this.ondcOrgCategory = ondcOrgCategory;
        this.ondcOrgTAT = ondcOrgTAT;
        this.state = state;
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

    @JsonProperty("tracking")
    public boolean isTracking() {
        return tracking;
    }

    @JsonProperty("tracking")
    public void setTracking(boolean tracking) {
        this.tracking = tracking;
    }

    @JsonProperty("@ondc/org/category")
    public String getOndcOrgCategory() {
        return ondcOrgCategory;
    }

    @JsonProperty("@ondc/org/category")
    public void setOndcOrgCategory(String ondcOrgCategory) {
        this.ondcOrgCategory = ondcOrgCategory;
    }

    @JsonProperty("@ondc/org/TAT")
    public String getOndcOrgTAT() {
        return ondcOrgTAT;
    }

    @JsonProperty("@ondc/org/TAT")
    public void setOndcOrgTAT(String ondcOrgTAT) {
        this.ondcOrgTAT = ondcOrgTAT;
    }

    @JsonProperty("state")
    public State getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
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
        sb.append("tracking");
        sb.append('=');
        sb.append(this.tracking);
        sb.append(',');
        sb.append("ondcOrgCategory");
        sb.append('=');
        sb.append(((this.ondcOrgCategory == null)?"<null>":this.ondcOrgCategory));
        sb.append(',');
        sb.append("ondcOrgTAT");
        sb.append('=');
        sb.append(((this.ondcOrgTAT == null)?"<null>":this.ondcOrgTAT));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
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
