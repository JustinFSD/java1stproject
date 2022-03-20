
public class CalenderDemo {
   public static void main(String[] args) {
	// Calender[] calenders = new Calender[2];
	
	Calender monthly= new Calender("Medium",20,"monthly","paper");
	Calender Daily =new Calender("small",24,"Daily","paper cut");
	
	Calender[] calenders = {monthly,Daily};
	
	
	for(Calender c:calenders) {
		System.out.println(c.toString());
	}
	
	
   }
}
