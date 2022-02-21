package com.studyeasy.datatypes;

public class BusTester {  
	 public static void main(String args[]) {
	
	Bus bus = new Bus();
	bus.slno=01;
	bus.Name="SRM";
	bus.Capacity=35;
	bus.BusNumber= "TN 01 AS 0919";
	bus.ContactNumber=9994878897l;
	bus.busCanCarry();
	bus.busCanMove();
	
	System.out.println("SI NO ="+bus.slno);
	System.out.println("Bus Name ="+bus.Name);
	System.out.println("Bus capacity ="+bus.Capacity);
	System.out.println("Bus Number ="+bus.BusNumber);
	System.out.println("Bus Contactnumber ="+bus.ContactNumber);
	
	
	
}
}