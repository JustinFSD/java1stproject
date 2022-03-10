package com.runtimeexception;



public class Machine {
	public void withDraw(int Amount) {
		if(Amount>20000||Amount<100||Amount%100!=0) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Collect the cash");
		}
		
	}

}
