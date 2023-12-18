
package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "end"
})
@Generated("jsonschema2pojo")
public class Fulfillment implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("end")
    private End end;
    private final static long serialVersionUID = -5378918937080520708L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param end
     * @param type
     */
    public Fulfillment(String type, End end) {
        super();
        this.type = type;
        this.end = end;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("end")
    public End getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(End end) {
        this.end = end;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fulfillment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
