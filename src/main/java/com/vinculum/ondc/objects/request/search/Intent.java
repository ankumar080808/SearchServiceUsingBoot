
package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "fulfillment",
    "payment"
})
@Generated("jsonschema2pojo")
public class Intent implements Serializable
{
	private final static long serialVersionUID = -3137384360072423345L;

    @JsonProperty("category")
    private Category category;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("item")
    private Item item;
    
   
    /**
     * No args constructor for use in serialization
     * 
     */
    public Intent() {
    }

    /**
     * 
     * @param payment
     * @param fulfillment
     * @param category
     */
    public Intent(Category category, Fulfillment fulfillment, Payment payment) {
        super();
        this.category = category;
        this.fulfillment = fulfillment;
        this.payment = payment;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
   
    public Item getItem() {
		return item;
	}

    @JsonProperty("item")
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Intent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("fulfillment");
        sb.append('=');
        sb.append(((this.fulfillment == null)?"<null>":this.fulfillment));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
