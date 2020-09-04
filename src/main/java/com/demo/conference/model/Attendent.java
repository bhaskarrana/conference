package com.demo.conference.model;

import java.util.Date;

public class Attendent extends User {
 String register;

public String getRegister() {
	return register;
}

public void setRegister(String register) {
	this.register = register;
}

public Attendent(String name, String company, String email, String topic, String speaker, String register) {
	super(name, company, email, topic, speaker);
	Date d1 = new Date(); 
	this.register = d1.toString();
}

@Override
public String toString() {
	return "Attendent [register=" + register + ", getName()=" + getName() + ", getCompany()=" + getCompany()
			+ ", getEmail()=" + getEmail() + ", getTopic()=" + getTopic() + ", getSpeaker()=" + getSpeaker()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


 
}
