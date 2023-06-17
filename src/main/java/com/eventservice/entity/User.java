package com.eventservice.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "t_eventservice_user", uniqueConstraints = {@UniqueConstraint(columnNames = {"company","usercode"}) })

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String company;
	private String usercode;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Event> events;
	
	public User() {
		super();
	}
	public User(Long id, String company, String usercode, String name) {
		super();
		this.id = id;
		this.company = company;
		this.usercode = usercode;
		this.name = name;
	}
	
	
	public User(Long id, String company, String usercode, String name, List<Event> events) {
		super();
		this.id = id;
		this.company = company;
		this.usercode = usercode;
		this.name = name;
		this.events = events;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company, id, name, usercode);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(company, other.company) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(usercode, other.usercode);
	}
	
	
	

}
