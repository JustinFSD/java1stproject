package com.studyeasy.runtimepolymarphysm4;

public class Tester {
	public static void main(String[]args) {
	Bank b1 =new Bank();
	Bank b2 =new Bank();
	boolean type1 =b2.equals(b1);
	System.out.println(type1);
	
	SbiBank s1 =new SbiBank();
	SbiBank s2 =new SbiBank();
	boolean type2 =s2.equals(s1);
	System.out.println(type2);
	
	Bank b3 =new Bank();
	SbiBank s3 =new SbiBank();
	boolean type3 =s3.equals(b3);
	System.out.println(type3);
	
	//Bank b =new Bank();
	//SbiBank s =new SbiBank();
	
	//System.out.println(b.provideLoanRateOfInterest());
	//b.displayDetails();
	
	}

}
