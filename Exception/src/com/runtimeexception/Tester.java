package com.runtimeexception;

public class Tester {
	 
	public static void main(String[]args) {
		Machine machine = new Machine();
		try {
			machine.withDraw(20000);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
