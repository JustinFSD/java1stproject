package com.studyeasy.runtimepolymarphysm4;

public class SbiBank extends Bank{
	public String branchName="kovilpatti";
	public String ifscCode ="SBIN0002672";
	public int noOfBranches =66;
	
	public Object provideLoanRateOfInterest() {
		return"12.5%";
				}
	public void displayDetails() {
		System.out.println(branchName);
		System.out.println(ifscCode);
		System.out.println(noOfBranches);


	}

}

