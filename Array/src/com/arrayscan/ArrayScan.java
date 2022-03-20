package com.arrayscan;

import java.util.Scanner;

public class ArrayScan {
	public static void main(String[]args) {
		System.out.println("Enter The Num Of Elements");
		Scanner in =new Scanner(System.in);
		int n =in .nextInt();
		String[] str=new String[n];
		System.out.println("Enter The String Array Elements");
		for(int i=0;i<str.length;i++) {
			str[i]=in.next();
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
		}
	}
	

}
