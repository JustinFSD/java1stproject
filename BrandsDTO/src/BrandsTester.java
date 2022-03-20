import java.util.ArrayList;
import java.util.ListIterator;

public class BrandsTester {
	public static void main(String[] args) {
		
		BrandsDTO brand =new BrandsDTO();
		brand.setBrandId(1);
		brand.setBrandName("MarutiSuzuki");
		brand.setExtablished(1980);
		brand.setIndustryType("AutoMobile");
		brand.setHeadQuarters("Delhi");
		
		BrandsDTO brand2 =new BrandsDTO();
		brand2.setBrandId(2);
		brand2.setBrandName("Mahindra");
		brand2.setExtablished(1970);
		brand2.setIndustryType("AutoMobile");
		brand2.setHeadQuarters("Mumbai");
		
		ArrayList<BrandsDTO> list = new ArrayList<BrandsDTO>(); 
				list.add(brand);
				list.add(brand2);
				
				System.out.println(list);
				
				ListIterator<BrandsDTO> itr = list.listIterator();
				System.out.println("forword direction");
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("Backword direction");
				while(itr.hasPrevious()) {
					System.out.println(itr.previous());
				}
				 
				 
	}
	
}