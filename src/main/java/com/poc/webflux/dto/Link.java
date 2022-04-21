package com.poc.webflux.dto;

import java.util.HashMap;
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
"rel",
"href",
"mediaType",
"templated"
})
@Generated("jsonschema2pojo")
public class Link {

@JsonProperty("rel")
private String rel;
@JsonProperty("href")
private String href;
@JsonProperty("mediaType")
private String mediaType;
@JsonProperty("templated")
private boolean templated;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("rel")
public String getRel() {
return rel;
}

@JsonProperty("rel")
public void setRel(String rel) {
this.rel = rel;
}

@JsonProperty("href")
public String getHref() {
return href;
}

@JsonProperty("href")
public void setHref(String href) {
this.href = href;
}

@JsonProperty("mediaType")
public String getMediaType() {
return mediaType;
}

@JsonProperty("mediaType")
public void setMediaType(String mediaType) {
this.mediaType = mediaType;
}

@JsonProperty("templated")
public boolean getTemplated() {
	return templated;
}

@JsonProperty("templated")
public void setTemplated(boolean templated) {
	this.templated = templated;
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