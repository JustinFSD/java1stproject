package com.whatsappexception;

public class JavaGroup {
	 public static void main(String[]args) {
		 String[] names= {"Justin","Sam","raj","ganesh","Mahindran"};
		 File file = new File();
		 Whatsapp whatsapp = new Whatsapp();
	 
	 try {
		 whatsapp.createGroup(names);
		 whatsapp.shareFiles(file);
	 }
   catch(Exception e) {
	   if(names.length>5) {
		   System.out.println(e.getMessage());
	   }
	   else {
		   System.out.println(e);
	   }
   }
}
}
