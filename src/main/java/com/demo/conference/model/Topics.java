package com.demo.conference.model;

import java.util.List;

public class Topics {
	private String title;
	private Speaker speaker;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Topics(String title, Speaker speaker, List<Attendent> attendents) {
		super();
		this.title = title;
		this.speaker = speaker;
		this.attendents = attendents;
	}
	@Override
	public String toString() {
		return "Topics [title=" + title + ", speaker=" + speaker + ", attendents=" + attendents + "]";
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public List<Attendent> getAttendents() {
		return attendents;
	}
	public void setAttendents(List<Attendent> attendents) {
		this.attendents = attendents;
	}
	private List<Attendent> attendents;
	

}
