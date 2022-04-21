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
"importanceFlag",
"text",
"updatedByAccount",
"updatedTime"
})
@Generated("jsonschema2pojo")
public class Banner {

@JsonProperty("importanceFlag")
private Object importanceFlag;
@JsonProperty("text")
private Object text;
@JsonProperty("updatedByAccount")
private Object updatedByAccount;
@JsonProperty("updatedTime")
private Object updatedTime;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("importanceFlag")
public Object getImportanceFlag() {
return importanceFlag;
}

@JsonProperty("importanceFlag")
public void setImportanceFlag(Object importanceFlag) {
this.importanceFlag = importanceFlag;
}

@JsonProperty("text")
public Object getText() {
return text;
}

@JsonProperty("text")
public void setText(Object text) {
this.text = text;
}

@JsonProperty("updatedByAccount")
public Object getUpdatedByAccount() {
return updatedByAccount;
}

@JsonProperty("updatedByAccount")
public void setUpdatedByAccount(Object updatedByAccount) {
this.updatedByAccount = updatedByAccount;
}

@JsonProperty("updatedTime")
public Object getUpdatedTime() {
return updatedTime;
}

@JsonProperty("updatedTime")
public void setUpdatedTime(Object updatedTime) {
this.updatedTime = updatedTime;
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
