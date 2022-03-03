package com.studyeasy.MultilevelInheritance;

public class Tester {
	public static void main (String[]args) {
		
		Mathematics maths = new Mathematics();
		maths.length(20);
		
		Geometry geometry=new Geometry();
		geometry.length(30);
		geometry.perameter(30,60);
		
		Square square = new Square();
		square.equalSides();
		square.length(40);
		square.perameter(40,30);
		
		
		
		
	}

}
