package com.edorei.expose.exception;

public class NoContentProvidedException extends Exception{
	
	private String message = null;
	
	public NoContentProvidedException(){
		super();
	}
	
	public NoContentProvidedException(String message){
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}
	
	
}
