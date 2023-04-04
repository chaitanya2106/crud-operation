package com.springboot.exception;

public class IdNotFoundException extends Exception {
String msg;

public IdNotFoundException(String msg) {
	super();
	this.msg = msg;
}

}
