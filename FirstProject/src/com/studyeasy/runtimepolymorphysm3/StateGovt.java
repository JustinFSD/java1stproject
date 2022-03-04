package com.studyeasy.runtimepolymorphysm3;

public class StateGovt extends CentralGovt {
	
	@Override
	public void sanctionedAmountForRation(String Amount) {
		System.out.println("State Govt sanctioned fund for poor peoples RS = "+ Amount+"/-");
	}
	public void sanctionedAmountForMedical(String Amount) {
		System.out.println("State Govt sanctioned fund for medical RS ="+ Amount+ "/-");
	}

	
	

}
