package com.service;

public class NotFoundException extends RuntimeException {
public NotFoundException()
{
	System.out.println("Book not found in the system");
}
public NotFoundException(String msg)
{
super(msg);	
}
}
