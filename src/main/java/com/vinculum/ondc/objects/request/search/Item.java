

package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "descriptor"
})
@Generated("jsonschema2pojo")
public class Item implements Serializable
{
	private final static long serialVersionUID = -5793625148586157728L;

    @JsonProperty("descriptor")
    private Descriptor descriptor=new Descriptor();
   
    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param descriptor
     */
    public Item(Descriptor descriptor) {
        super();
        this.descriptor = descriptor;
    }

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("descriptor");
        sb.append('=');
        sb.append(((this.descriptor == null)?"<null>":this.descriptor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
