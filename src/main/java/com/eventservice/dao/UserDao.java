package com.eventservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.eventservice.entity.User;

public interface UserDao extends CrudRepository<User, Long>{
	
	public User findByCompanyAndUsercode(String company, String usercode);

}
