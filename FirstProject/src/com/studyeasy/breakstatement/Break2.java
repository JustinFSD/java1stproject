package com.studyeasy.breakstatement;
public class Break2 {
	public static void main(String[] args) {
		for(int i=100; i>=1; i--) {
			if(i==50) {
				break;
			}
			System.out.println(i);
		}
	}

}