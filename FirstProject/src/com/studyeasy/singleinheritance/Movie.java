package com.studyeasy.singleinheritance;

public class Movie extends Theatre{
	String movieName;
	String movieGenre;
	String heroName;
	
	public void ticketConfirmationStatus() {
		System.out.println(movieName +"is confirmed ticket" + theatreName + "in the location"+ theatreLocation);
	}	
	
	public void movieDetail() {
		System.out.println(heroName+"is acted at a movie"+movieName+"gener of "+ movieGenre+ "it is relesed on the theatre"+theatreName );
	}
   
}
