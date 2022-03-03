package com.project.facebook;

public class Facebook {
	
	public void searchUser(int userId) {
		System.out.println("USER ID is ="+ userId);
	}
	public void searchUser(long phoneNumber) {
		System.out.println("PHONE NUMBER ="+ phoneNumber);
	}
   public void searchUser( String firstName, String lastName) {
	   System.out.println("FULL NAME ="+ firstName +" "+ lastName);
	   
   }
   public void searchUser(String eMail) {
	   System.out.println("EMAIL ="+ eMail);
   }
}
