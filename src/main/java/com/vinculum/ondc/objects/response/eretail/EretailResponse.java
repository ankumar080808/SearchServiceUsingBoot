
package com.vinculum.ondc.objects.response.eretail;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "responseCode",
    "responseMessage",
    "requestStatus"
})
@Generated("jsonschema2pojo")
public class EretailResponse  implements Serializable 
{

    @JsonProperty("responseCode")
    private long responseCode;
    @JsonProperty("responseMessage")
    private String responseMessage;
    @JsonProperty("requestStatus")
    @Valid
    private RequestStatus requestStatus;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7861803424154906383L;

    /**
     * No args constructor for use in serialization
     * 
     */
 
    

    @JsonProperty("responseCode")
    public long getResponseCode() {
        return responseCode;
    }

    @JsonProperty("responseCode")
    public void setResponseCode(long responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("responseMessage")
    public String getResponseMessage() {
        return responseMessage;
    }

    @JsonProperty("responseMessage")
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @JsonProperty("requestStatus")
    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    @JsonProperty("requestStatus")
    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
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
        sb.append(EretailResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("responseCode");
        sb.append('=');
        sb.append(this.responseCode);
        sb.append(',');
        sb.append("responseMessage");
        sb.append('=');
        sb.append(((this.responseMessage == null)?"<null>":this.responseMessage));
        sb.append(',');
        sb.append("requestStatus");
        sb.append('=');
        sb.append(((this.requestStatus == null)?"<null>":this.requestStatus));
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
