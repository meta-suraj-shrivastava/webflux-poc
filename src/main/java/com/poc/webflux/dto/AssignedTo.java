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
"account",
"staffGroup"
})
@Generated("jsonschema2pojo")
public class AssignedTo {

@JsonProperty("account")
private Account account;
@JsonProperty("staffGroup")
private StaffGroup staffGroup;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("account")
public Account getAccount() {
return account;
}

@JsonProperty("account")
public void setAccount(Account account) {
this.account = account;
}

@JsonProperty("staffGroup")
public StaffGroup getStaffGroup() {
return staffGroup;
}

@JsonProperty("staffGroup")
public void setStaffGroup(StaffGroup staffGroup) {
this.staffGroup = staffGroup;
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