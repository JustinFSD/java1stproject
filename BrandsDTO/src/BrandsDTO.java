import java.io.Serializable;

public class BrandsDTO implements Serializable{
	
	private int BrandId;
	private String BrandName;
	private int Established;
	private String IndustryType;
	private String HeadQuarters;
	public BrandsDTO() {
		
	}
	 public int getBrandId() {
		 return BrandId;
	 }
	 
	 public void setBrandId(int brandId) {
		 BrandId =brandId;
		 
	 }
	 public String getBrandName() {
		 return BrandName;
	 }
	 public void setBrandName(String brandName) {
		 BrandName =brandName;
	 }
	public int Established() {
		return Established;
	}
	public void setExtablished(int established) {
		Established=established;
	} 
	public String IndustryType() {
		return IndustryType;
	}
	public void setIndustryType(String industryType) {
		IndustryType =industryType;
	}
	public String HeadQuarters() {
		return HeadQuarters;
	}
	public void setHeadQuarters(String headQuarters ) {
		HeadQuarters =headQuarters;
	}
	@Override
	public String toString() {
		return "BrandsDTO [BrandId=" + BrandId + ", BrandName=" + BrandName + ", Established=" + Established
				+ ", IndustryType=" + IndustryType + ", HeadQuarters=" + HeadQuarters + "]";
	}
	
	
	

}
