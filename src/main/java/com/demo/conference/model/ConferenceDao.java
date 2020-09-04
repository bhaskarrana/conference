package com.demo.conference.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ConferenceDao {
	
	private HashMap<String,HashMap<String,Topics>> topics;

	public List<Topics> getTopics() {
		List< Topics> result = new ArrayList<>();
		for ( String key:topics.keySet())
			for ( String el: topics.get(key).keySet())
			result.add(topics.get(key).get(el));
		return result;
	}

	public void setTopics(HashMap<String,HashMap<String,Topics>> topics) {
		this.topics = topics;
	}

	public ConferenceDao(HashMap<String,HashMap<String,Topics>> topics) {
	    super();
		this.topics = topics;
	}
	
	public void addTopic(Speaker sp) {
	     topics.putIfAbsent(sp.getSpeaker(), new HashMap<>());
	     if ( topics.get(sp.getSpeaker()).get(sp.getTopic())==null )
	        topics.get(sp.getSpeaker()).put(sp.getTopic(),new Topics(sp.getTopic(),sp,new ArrayList<Attendent>()));

	}

	public void removeTopic(String speaker,String topic) {
		if (!topics.containsKey(speaker))
			throw new ResourceNotFound("speaker ="+speaker);
		if(!topics.get(speaker).containsKey(topic))
			throw new ResourceNotFound("For this +"+"speaker ="+ speaker+" Not present topic ="+topic);
		 topics.get(speaker).remove(topic);
		
	}

	public void addUserToTopic(Attendent attendent, String topic,String speaker) {
		// TODO Auto-generated method stub
		if (!topics.containsKey(speaker))
			throw new ResourceNotFound("speaker ="+speaker);
		if (!topics.get(speaker).containsKey(topic))
			throw new ResourceNotFound("For this +"+"speaker ="+ speaker+" Not present topic ="+topic);
		topics.get(speaker).get(topic).getAttendents().add(attendent);
	}

}
