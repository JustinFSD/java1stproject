package com.whatsappexception;

public class Whatsapp {
	  
	public void createGroup (String[] names) {
		if(names.length>5) {
			throw new WhatsappException();
		}
		else {
			System.out.println("your whatsapp group create succesfully..");
		}
		
	}
	public void shareFiles(File file) {
		if(file.size>1000) {
			throw new WhatsappException();
		}
		else {
			System.out.println("file updated succesfully");
		}
	}

}
