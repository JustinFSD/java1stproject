package com.studyeasy.runtimepolymarphysm;

public class Tester {
	
	public static void main(String[]args) {
		
		//Father father =new Father();
		//father.marryToHisSon();
		
		Son son =new Son();
		son.marryToHisSon();
		
		Father father1 = new Son();
		father1.marryToHisSon();
	}

}
