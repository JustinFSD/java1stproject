package com.studyeasy.runtimepolymarphysm2;

public class Tester {
	 public static void main(String[]args) {
		  
		 RBI rbi =new RBI();
		 rbi.displayRateOfinterest();
		 
		 ICICI icici =new ICICI();
		 icici.displayRateOfinterest();
		 
		 HDFC hdfc =new HDFC();
		 hdfc.displayRateOfinterest();
		 
		 RBI rbi1 = new ICICI();
		 rbi1.displayRateOfinterest();
		 
		 RBI rbi2 =new HDFC();
		 rbi2.displayRateOfinterest();
		 
		 
		 
		 
	 }

}
