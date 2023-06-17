package com.eventservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eventservice.entity.Event;
import com.eventservice.entity.dto.EventRegisterDto;
import com.eventservice.service.IEventService;

@RestController
@RequestMapping("/api/event")
public class EventController {
	
	@Autowired
	IEventService eventService;
	
	@PostMapping("/registerEvent")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Event> registerEvent(@RequestBody EventRegisterDto event) {
		
		Event createdEvent = eventService.registerEvent(event);			
		return ResponseEntity.status(HttpStatus.CREATED).body(createdEvent);
	}
}
