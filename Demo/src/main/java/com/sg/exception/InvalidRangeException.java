package com.sg.exception;

public class InvalidRangeException extends RuntimeException{

	public InvalidRangeException() {
		super();
	}
	
	public InvalidRangeException(String msg) {
		super(msg);
	}
}
