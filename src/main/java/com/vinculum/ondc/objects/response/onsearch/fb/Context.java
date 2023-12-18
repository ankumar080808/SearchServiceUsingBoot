
package com.vinculum.ondc.objects.response.onsearch.fb;
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
    "domain",
    "country",
    "city",
    "action",
    "core_version",
    "bap_id",
    "bap_uri",
    "bpp_id",
    "bpp_uri",
    "transaction_id",
    "message_id",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class Context implements Serializable
{

    @JsonProperty("domain")
    private String domain;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("action")
    private String action;
    @JsonProperty("core_version")
    private String coreVersion;
    @JsonProperty("bap_id")
    private String bapId;
    @JsonProperty("bap_uri")
    private String bapUri;
    @JsonProperty("bpp_id")
    private String bppId;
    @JsonProperty("bpp_uri")
    private String bppUri;
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("message_id")
    private String messageId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 9087529692265868615L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Context() {
    }

    /**
     * 
     * @param country
     * @param bppUri
     * @param bppId
     * @param city
     * @param domain
     * @param action
     * @param messageId
     * @param bapUri
     * @param coreVersion
     * @param bapId
     * @param transactionId
     * @param timestamp
     */
    public Context(String domain, String country, String city, String action, String coreVersion, String bapId, String bapUri, String bppId, String bppUri, String transactionId, String messageId, String timestamp) {
        super();
        this.domain = domain;
        this.country = country;
        this.city = city;
        this.action = action;
        this.coreVersion = coreVersion;
        this.bapId = bapId;
        this.bapUri = bapUri;
        this.bppId = bppId;
        this.bppUri = bppUri;
        this.transactionId = transactionId;
        this.messageId = messageId;
        this.timestamp = timestamp;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("core_version")
    public String getCoreVersion() {
        return coreVersion;
    }

    @JsonProperty("core_version")
    public void setCoreVersion(String coreVersion) {
        this.coreVersion = coreVersion;
    }

    @JsonProperty("bap_id")
    public String getBapId() {
        return bapId;
    }

    @JsonProperty("bap_id")
    public void setBapId(String bapId) {
        this.bapId = bapId;
    }

    @JsonProperty("bap_uri")
    public String getBapUri() {
        return bapUri;
    }

    @JsonProperty("bap_uri")
    public void setBapUri(String bapUri) {
        this.bapUri = bapUri;
    }

    @JsonProperty("bpp_id")
    public String getBppId() {
        return bppId;
    }

    @JsonProperty("bpp_id")
    public void setBppId(String bppId) {
        this.bppId = bppId;
    }

    @JsonProperty("bpp_uri")
    public String getBppUri() {
        return bppUri;
    }

    @JsonProperty("bpp_uri")
    public void setBppUri(String bppUri) {
        this.bppUri = bppUri;
    }

    @JsonProperty("transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("message_id")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("message_id")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
