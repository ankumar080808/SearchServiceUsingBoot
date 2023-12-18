
package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "context",
    "message"
})
@Generated("jsonschema2pojo")
public class Search implements Serializable
{
	private final static long serialVersionUID = 4619932071535757407L;

    @JsonProperty("context")
    private Context context=new Context();
    @JsonProperty("message")
    private Message message=new Message();
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public Search() {
    }

    public Search(String jsonString) {
        
    }

    /**
     * 
     * @param context
     * @param message
     */
    public Search(Context context, Message message) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Search.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
