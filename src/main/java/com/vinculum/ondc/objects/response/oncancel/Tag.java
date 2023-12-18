
package com.vinculum.ondc.objects.response.oncancel;

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
    "code",
    "list"
})
@Generated("jsonschema2pojo")
public class Tag implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("list")
    private java.util.List<com.vinculum.ondc.objects.response.oncancel.List> list;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3424036075994751337L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag() {
    }

    /**
     * 
     * @param code
     * @param list
     */
    public Tag(String code, java.util.List<com.vinculum.ondc.objects.response.oncancel.List> list) {
        super();
        this.code = code;
        this.list = list;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("list")
    public java.util.List<com.vinculum.ondc.objects.response.oncancel.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.vinculum.ondc.objects.response.oncancel.List> list) {
        this.list = list;
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
