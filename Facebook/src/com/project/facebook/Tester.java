package com.project.facebook;

public class Tester {
	public static void main (String[]args) {
		Facebook fb =new Facebook();
		fb.searchUser(2201);
		fb.searchUser(8248896871l);
		fb.searchUser("JUSTIN", "SAMRAJ");
		fb.searchUser("samraj.aero@gmail.com");
		
		
		
	}

}
