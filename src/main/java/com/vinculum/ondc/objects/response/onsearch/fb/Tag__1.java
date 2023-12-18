
package com.vinculum.ondc.objects.response.onsearch.fb;

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
    "code",
    "list"
})
@Generated("jsonschema2pojo")
public class Tag__1 implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("list")
    private List<List__1> list;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1965131187239377695L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag__1() {
    }

    /**
     * 
     * @param code
     * @param list
     */
    public Tag__1(String code, List<List__1> list) {
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
    public List<List__1> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(List<List__1> list) {
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
