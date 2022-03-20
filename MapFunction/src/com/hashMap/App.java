package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
	  
	  Map<Integer,String>lecturer = new HashMap<Integer ,String>();
	  lecturer.put(6, "Datatypes");
	  lecturer.put(8, "Vaiables");
	  lecturer.put(9, "OOps");
	  lecturer.put(1, "Exception");
	  lecturer.put(5, "Arrays");
	  lecturer.put(3, "String");
	  lecturer.put(2, "Collection");
	  lecturer.put(4, "list");
	  lecturer.put(7, "Map");
	  
	  for(Map.Entry<Integer,String>entry:lecturer.entrySet()) {
		  System.out.println("key:"+ entry.getKey()+" value: "+ entry.getValue()) ;
	  }
	  
	
}
}
