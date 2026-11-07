package com.usersession.serialization;

import java.io.Serializable;

public class UserSession implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userId;
	private String userName;
	private String sessionId;
	private transient String  password;
	public UserSession(String userId, String userName, String sessionId, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.sessionId = sessionId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public String getPassword() {
		return password;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

