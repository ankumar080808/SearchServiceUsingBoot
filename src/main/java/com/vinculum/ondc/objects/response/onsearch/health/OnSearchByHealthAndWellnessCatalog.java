
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
    "context",
    "message"
})
@Generated("jsonschema2pojo")
public class OnSearchByHealthAndWellnessCatalog implements Serializable
{

    @JsonProperty("context")
    private Context context;
    @JsonProperty("message")
    private Message message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -721084626319745421L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OnSearchByHealthAndWellnessCatalog() {
    }

    /**
     * 
     * @param context
     * @param message
     */
    public OnSearchByHealthAndWellnessCatalog(Context context, Message message) {
        super();
        this.context = context;
        this.message = message;
    }

    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
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
