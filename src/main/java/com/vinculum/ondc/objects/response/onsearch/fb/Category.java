
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
    "id",
    "parent_category_id",
    "descriptor",
    "tags"
})
@Generated("jsonschema2pojo")
public class Category implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("parent_category_id")
    private String parentCategoryId;
    @JsonProperty("descriptor")
    private Descriptor__1 descriptor;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4851195644420759030L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param parentCategoryId
     * @param id
     * @param descriptor
     * @param tags
     */
    public Category(String id, String parentCategoryId, Descriptor__1 descriptor, List<Tag> tags) {
        super();
        this.id = id;
        this.parentCategoryId = parentCategoryId;
        this.descriptor = descriptor;
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

    @JsonProperty("parent_category_id")
    public String getParentCategoryId() {
        return parentCategoryId;
    }

    @JsonProperty("parent_category_id")
    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @JsonProperty("descriptor")
    public Descriptor__1 getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor__1 descriptor) {
        this.descriptor = descriptor;
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
