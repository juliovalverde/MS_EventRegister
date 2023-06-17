package com.eventservice.service;

import com.eventservice.entity.Event;
import com.eventservice.entity.dto.EventRegisterDto;

public interface IEventService {
	
	public Event registerEvent(EventRegisterDto eventRegisterDto);

}
