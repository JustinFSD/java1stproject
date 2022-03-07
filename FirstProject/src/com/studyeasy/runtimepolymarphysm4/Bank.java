package com.studyeasy.runtimepolymarphysm4;

public class Bank {
	public String branchName ="Vilathikulam";
	public String ifscCode ="TMBL0000009";
	public int noOfBranches =57;
	public Bank() {
		
	}
	public Object provideLoanRateOfInterest() {
		return"10.5%";
				}
		
	
	@Override
	public boolean equals(Object bank) {
		if (bank instanceof Bank) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
}
 
