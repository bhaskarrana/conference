package com.demo.conference.model;

public class Speaker extends User{
  String bio;

public String getBio() {
	return bio;
}

public void setBio(String bio) {
	this.bio = bio;
}

public Speaker(String name, String company, String email, String topic, String speaker, String bio) {
	super(name, company, email, topic, speaker);
	this.bio = bio;
}

@Override
public String toString() {
	return "Speaker [bio=" + bio + ", getName()=" + getName() + ", getCompany()=" + getCompany() + ", getEmail()="
			+ getEmail() + ", getTopic()=" + getTopic() + ", getSpeaker()=" + getSpeaker() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


}
