package com.springboot.exception;

public class EmployeeAlreadyExistsException extends RuntimeException {
	String msg;
public EmployeeAlreadyExistsException(String msg) {
	super(msg);
	// TODO Auto-generated constructor stub
}
}
