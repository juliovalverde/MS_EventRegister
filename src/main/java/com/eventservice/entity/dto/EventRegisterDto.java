package com.eventservice.entity.dto;

import java.util.Objects;

public class EventRegisterDto {
	
	private String userCompany;
	private String userCode;
	private String userName;
	
	private String eventService;
	private String eventType;
	private String eventDetail;
	
	private String eventEndPointName;
	
	public EventRegisterDto() {
		super();
	}



	public EventRegisterDto(String userCompany, String userCode, String userName, String eventService, String eventType,
			String eventDetail, String eventEndPointName) {
		super();
		this.userCompany = userCompany;
		this.userCode = userCode;
		this.userName = userName;
		this.eventService = eventService;
		this.eventType = eventType;
		this.eventDetail = eventDetail;
		this.eventEndPointName = eventEndPointName;
	}



	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEventService() {
		return eventService;
	}

	public void setEventService(String eventService) {
		this.eventService = eventService;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}



	public String getEventEndPointName() {
		return eventEndPointName;
	}



	public void setEventEndPointName(String eventEndPointName) {
		this.eventEndPointName = eventEndPointName;
	}



	@Override
	public int hashCode() {
		return Objects.hash(eventDetail, eventEndPointName, eventService, eventType, userCode, userCompany, userName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventRegisterDto other = (EventRegisterDto) obj;
		return Objects.equals(eventDetail, other.eventDetail)
				&& Objects.equals(eventEndPointName, other.eventEndPointName)
				&& Objects.equals(eventService, other.eventService) && Objects.equals(eventType, other.eventType)
				&& Objects.equals(userCode, other.userCode) && Objects.equals(userCompany, other.userCompany)
				&& Objects.equals(userName, other.userName);
	}
	
	

}
