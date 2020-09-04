package com.demo.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.conference.model.Attendent;
import com.demo.conference.model.ConferenceDao;
import com.demo.conference.model.Speaker;
import com.demo.conference.model.Topics;

@Component
public class ConferenceControllerService {

	@Autowired
	private ConferenceDao conferenceDao;

	public ConferenceDao getConferenceDao() {
		return conferenceDao;
	}

	public void setConferenceDao(ConferenceDao conferenceDao) {
		this.conferenceDao = conferenceDao;
	}

	public ConferenceControllerService(ConferenceDao conferenceDao) {
		super();
		this.conferenceDao = conferenceDao;
	}
	
	public void addTopic(Speaker sp) {
		conferenceDao.addTopic(sp);
	}
	
	public List<Topics> getAllTopic() {
		return conferenceDao.getTopics();
	}
	
	public void addUserToTopic(Attendent attendent, String topic,String speaker) {
		conferenceDao.addUserToTopic(attendent,topic,speaker);
	}
	
	public void removeTopic(String speaker,String topic) {
		conferenceDao.removeTopic(speaker,topic);
	}
}
