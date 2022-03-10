package com.whatsappexception;

public class WhatsappException extends RuntimeException {
	
	@Override
	public String getMessage() {
		 return "cant create group more than 5 members";	
		 }
	
	public String toString() {
		return"cant upload a file, if it is more than 1 GB";
	}
	

}
