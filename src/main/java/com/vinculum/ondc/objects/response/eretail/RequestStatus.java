
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
    "uniqueKey",
    "requestKey",
    "outputKey",
    "status",
    "errorDesc",
    "errorCode"
})
@Generated("jsonschema2pojo")
public class RequestStatus implements Serializable
{

    @JsonProperty("uniqueKey")
    private String uniqueKey;
    @JsonProperty("requestKey")
    private String requestKey;
    @JsonProperty("outputKey")
    private String outputKey;
    @JsonProperty("status")
    private String status;
    @JsonProperty("errorDesc")
    private Object errorDesc;
    @JsonProperty("errorCode")
    private Object errorCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5039448893769298484L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestStatus() {
    }

    /**
     * 
     * @param outputKey
     * @param errorDesc
     * @param requestKey
     * @param uniqueKey
     * @param errorCode
     * @param status
     */
    public RequestStatus(String uniqueKey, String requestKey, String outputKey, String status, Object errorDesc, Object errorCode) {
        super();
        this.uniqueKey = uniqueKey;
        this.requestKey = requestKey;
        this.outputKey = outputKey;
        this.status = status;
        this.errorDesc = errorDesc;
        this.errorCode = errorCode;
    }

    @JsonProperty("uniqueKey")
    public String getUniqueKey() {
        return uniqueKey;
    }

    @JsonProperty("uniqueKey")
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    @JsonProperty("requestKey")
    public String getRequestKey() {
        return requestKey;
    }

    @JsonProperty("requestKey")
    public void setRequestKey(String requestKey) {
        this.requestKey = requestKey;
    }

    @JsonProperty("outputKey")
    public String getOutputKey() {
        return outputKey;
    }

    @JsonProperty("outputKey")
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("errorDesc")
    public Object getErrorDesc() {
        return errorDesc;
    }

    @JsonProperty("errorDesc")
    public void setErrorDesc(Object errorDesc) {
        this.errorDesc = errorDesc;
    }

    @JsonProperty("errorCode")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
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
        sb.append(RequestStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uniqueKey");
        sb.append('=');
        sb.append(((this.uniqueKey == null)?"<null>":this.uniqueKey));
        sb.append(',');
        sb.append("requestKey");
        sb.append('=');
        sb.append(((this.requestKey == null)?"<null>":this.requestKey));
        sb.append(',');
        sb.append("outputKey");
        sb.append('=');
        sb.append(((this.outputKey == null)?"<null>":this.outputKey));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("errorDesc");
        sb.append('=');
        sb.append(((this.errorDesc == null)?"<null>":this.errorDesc));
        sb.append(',');
        sb.append("errorCode");
        sb.append('=');
        sb.append(((this.errorCode == null)?"<null>":this.errorCode));
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
