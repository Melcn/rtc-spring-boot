package com.roadtocda.demo.model;

public class helloWorld {
	
	private String message = "Hello World";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloWorld [message=" + message + "]";
	}
	
	

}
