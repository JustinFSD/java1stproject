package com.treemap;

public class Code implements Comparable<Code> {
	 
	private String SectionNo;
	private String LectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		SectionNo = sectionNo;
		LectureNo = lectureNo;
	}
  public String getSectionNo() {
	  return SectionNo;
  }
  public void setSectionNo(String sectionNo) {
	  SectionNo =sectionNo;
  }
  public String getLectureNo() {
	  return LectureNo;
  }
  public void setLectureNo(String lectureNo) {
	  LectureNo=lectureNo;
	  
  }
@Override
public String toString() {
	return "Code [SectionNo=" + SectionNo + ", LectureNo=" + LectureNo + "]";
}
@Override
public int compareTo(Code o) {
	String code1 =SectionNo.concat(LectureNo);
	String code2 =o.getSectionNo()+o.getLectureNo();
	return code1.compareTo(code2);
}
	

}
