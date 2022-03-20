package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class App {



	public static void main(String[] args) {
		Map<Code,String> lecturer =new TreeMap<Code,String>();
		
		lecturer.put(new Code("S01","L01"), "Datatypes");
		lecturer.put(new Code("S02","L02"), "Variables");
		lecturer.put(new Code("S03","L03"), "OOps");
		lecturer.put(new Code("S04","L04"),"Exception");
		lecturer.put(new Code("S05","L05"),"Arrays");
		lecturer.put(new Code("S06","L06"),"Strings");
		lecturer.put(new Code("S07","L07"),"collection");
		
		for(Map.Entry<Code,String>entry:lecturer.entrySet()) {
               System.out.println("Key :" + entry.getKey()+ "VAlue :"+ entry.getValue());
			
		}
		}
	}


 





