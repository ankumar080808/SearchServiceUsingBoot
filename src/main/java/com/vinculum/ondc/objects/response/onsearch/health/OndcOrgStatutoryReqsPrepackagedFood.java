
package com.vinculum.ondc.objects.response.onsearch.health;


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
    "ingredients_info"
})
@Generated("jsonschema2pojo")
public class OndcOrgStatutoryReqsPrepackagedFood implements Serializable
{

    @JsonProperty("ingredients_info")
    private String ingredientsInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7287444138928109442L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OndcOrgStatutoryReqsPrepackagedFood() {
    }

    /**
     * 
     * @param ingredientsInfo
     */
    public OndcOrgStatutoryReqsPrepackagedFood(String ingredientsInfo) {
        super();
        this.ingredientsInfo = ingredientsInfo;
    }

    @JsonProperty("ingredients_info")
    public String getIngredientsInfo() {
        return ingredientsInfo;
    }

    @JsonProperty("ingredients_info")
    public void setIngredientsInfo(String ingredientsInfo) {
        this.ingredientsInfo = ingredientsInfo;
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
        sb.append(OndcOrgStatutoryReqsPrepackagedFood.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ingredientsInfo");
        sb.append('=');
        sb.append(((this.ingredientsInfo == null)?"<null>":this.ingredientsInfo));
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
