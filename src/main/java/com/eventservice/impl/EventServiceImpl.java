package com.eventservice.impl;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventservice.dao.EventDao;
import com.eventservice.dao.UserDao;
import com.eventservice.entity.Event;
import com.eventservice.entity.User;
import com.eventservice.entity.dto.EventRegisterDto;
import com.eventservice.service.IEventService;
import java.util.Date;

@Service
public class EventServiceImpl implements IEventService {
	
	@Autowired
	EventDao eventDao;
	
	@Autowired
	UserDao userDao;
	
	public Event registerEvent(EventRegisterDto eventRegisterDto) {
		Event event = new Event();
	
		User eventUser = userDao.findByCompanyAndUsercode(eventRegisterDto.getUserCompany(),eventRegisterDto.getUserCode());
		if(eventUser == null){
			User newUser = new User();
			newUser.setCompany(eventRegisterDto.getUserCompany());
			newUser.setUsercode(eventRegisterDto.getUserCode());
			newUser.setName(eventRegisterDto.getUserName());
			eventUser = userDao.save(newUser);
		}
		
		event.setDetail(eventRegisterDto.getEventDetail());
		event.setEventDate(new Date());
		event.setEventType(eventRegisterDto.getEventType());
		event.setService(eventRegisterDto.getEventService());
		event.setUser(eventUser);
		event.setEndPointName(eventRegisterDto.getEventEndPointName());
		
		return eventDao.save(event);
		
		
	}

}
