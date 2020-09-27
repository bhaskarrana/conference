package com.demo.conference.controller;

/*public class ConferenceController {

}


package com.demo.conference.controller;
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.conference.model.Attendent;
import com.demo.conference.model.Speaker;
import com.demo.conference.model.Topics;
import com.demo.conference.service.ConferenceControllerService;

@RestController

public class ConferenceController {
	
	@Autowired
	ConferenceControllerService conferenceControllerService;
	
	//@Autowired
	//conferenceUtil conferenceUtil;
	
	@RequestMapping(value="v1/conferences/talks", method =  RequestMethod.POST)
    void addConference(@RequestBody Speaker topic){
		conferenceControllerService.addTopic(topic);
    }
	// GET
    @RequestMapping(value="v1/conferences/talks", method =  RequestMethod.GET)
   
    List<Topics> getAllConference (  ){
    	     return conferenceControllerService.getAllTopic();
            
     }
    
   
    @RequestMapping(value="v1/conferences/users", method =  RequestMethod.POST)
    void addUserToConference(@RequestBody Attendent attendent){
		conferenceControllerService.addUserToTopic(attendent, attendent.getTopic(),attendent.getSpeaker());
    }
    
    
    @RequestMapping(value="v1/conferences/talks/{speaker}/{talk}", method =  RequestMethod.DELETE)
    
    void removeConference (@PathVariable String speaker, @PathVariable  String talk ){
    	   conferenceControllerService.removeTopic(speaker, talk);
    	   conferenceControllerService.removeTopic(speaker, talk);
    	   conferenceControllerService.removeTopic(speaker, talk);
    	

     }

}
