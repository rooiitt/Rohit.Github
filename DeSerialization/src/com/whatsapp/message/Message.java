package com.whatsapp.message;

import java.io.Serializable;

/*
 * Serializable :-  Process of writing object into byte stream so that it can be transfered over 
 * the network, share to database or write to file file system.
 * 
 * we will do  seriizaton, you write the object to the file system, then may file send to you,
 *  somebody else will deserialize  it n' read that object again
 */
public class Message implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String messageId;
	private String message;
	private transient String userId; // will be skipped during serialization

	public Message(String messageId, String message , String userId ) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userId = userId;
	}

	public String getMessageId() {
		return messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
