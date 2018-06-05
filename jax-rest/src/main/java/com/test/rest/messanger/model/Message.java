package com.test.rest.messanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private int id ;
	private String from ;
	private String to ;

	private String message ;	
	
	public Message() {
		
	}
	
	public Message(int id, String from, String to, String message) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", from=" + from + ", to=" + to + ", message=" + message + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
		
}
