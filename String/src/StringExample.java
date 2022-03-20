
public class StringExample {
public static void main(String[]args) {
	String s =new String("Justin");
	String s2 = new String("Mahindran");
	
	System.out.println(s.charAt(3));
	System.out.println(s.codePointAt(3));
	System.out.println(s.codePointBefore(2));
	System.out.println(s2.equals(s));
	System.out.println(s2.concat(s));
	System.out.println(s.endsWith(s2));
	System.out.println(s.isEmpty());
	System.out.println(s.length());
	System.out.println(s.lastIndexOf(4));
	System.out.println(s2.replace(s, s2));
	System.out.println(s2.compareTo(s));
	System.out.println(s2.matches(s));
	System.out.println(s.repeat(3));
}
}
