package com.eventservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.eventservice.entity.Event;

public interface EventDao extends CrudRepository<Event, Long> {

}
