package com.demo.conference.model;

public class User {
  private String name;
  private String company;
  private String email;
  private  String topic;
  private String speaker;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public User(String name, String company, String email, String topic, String speaker) {
	super();
	this.name = name;
	this.company = company;
	this.email = email;
	this.topic = topic;
	this.speaker = speaker;
}
public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
public String getSpeaker() {
	return speaker;
}
public void setSpeaker(String speaker) {
	this.speaker = speaker;
}
@Override
public String toString() {
	return "User [name=" + name + ", company=" + company + ", email=" + email + ", topic=" + topic + ", speaker="
			+ speaker + "]";
}

  


}
