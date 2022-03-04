package com.studyeasy.runtimepolymorphysm3;

public class Tester {
    public static void main(String[]args) {
    	CentralGovt center =  new CentralGovt();
    	center.sanctionedAmountForRation("50,00,000");
    	center.sanctionedAmountForMedical("1,00,00,000");
    	System.out.println("***********************************************");
    	
    	StateGovt state = new StateGovt();
    	state.sanctionedAmountForRation("20,00,000");
    	state.sanctionedAmountForMedical("45,00,000");
    	System.out.println("***********************************************");

    	CentralGovt central1 = new StateGovt();
    	state.sanctionedAmountForRation("20,00,000");
    	state.sanctionedAmountForMedical("45,00,000");
    	System.out.println("***********************************************");
    }

    }

