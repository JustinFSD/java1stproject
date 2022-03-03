package com.studyeasy.singleinheritance;

public class Tester {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.movieName="valimai";
		movie.movieGenre="Actin thriller";
		movie.heroName="AjithKumar";
		movie.theatreName="Rohini";
		movie.theatreLocation="Chennai";
		movie.theatreType="Multiplex";
		
		movie.ticketConfirmationStatus();
		
		movie.movieDetail();
		
		
		
	}

}
