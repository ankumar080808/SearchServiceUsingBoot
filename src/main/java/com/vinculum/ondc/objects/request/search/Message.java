package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "intent"
})
@Generated("jsonschema2pojo")
public class Message implements Serializable
{

    @JsonProperty("intent")
    private Intent intent=new Intent();
    private final static long serialVersionUID = -1822126898201226065L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param intent
     */
    public Message(Intent intent) {
        super();
        this.intent = intent;
    }

    @JsonProperty("intent")
    public Intent getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Message.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("intent");
        sb.append('=');
        sb.append(((this.intent == null)?"<null>":this.intent));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
