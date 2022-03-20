package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
   public static void main(String[]args) {
	  ArrayList<String> list=new ArrayList<>();
	  list.add("Dinesh");
	  list.add("Bhargav");
	  list.add("Justin");
	  list.add("Mahindran");
	  list.add("Guru");
	  
	  System.out.println(list);
	  
	  Iterator<String> itr = list.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
		  
	  }
	  
	  for(String str:list) {
		  System.out.println(str);
	  }
	  
	  
   }
}
