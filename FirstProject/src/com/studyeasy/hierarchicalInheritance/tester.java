package com.studyeasy.hierarchicalInheritance;

public class tester {
   public static void main(String[] args) {
     
	   Animal animal = new Animal();
	   animal.eat();
	   
	   Dog dog =new Dog();
	   dog.eat();
	   dog.bark();
	   
	   Cat cat =new Cat();
	   cat.eat();
	   cat.meow();
	   
	   Lion lion =new Lion();
	   lion.eat();
	   lion.roar();
	   
	   
   }
}
