package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class SimpleMovieListener {

	//@Autowired(required=true)
	private MovieFinder movieFinder;


	public MovieFinder getMovieFinder() {
		return movieFinder;
	}

//@Required
	@Autowired
	@Qualifier("s2")
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	//@Autowired
	/*public SimpleMovieListener(MovieFinder movieFinder) {
		super();
		this.movieFinder = movieFinder;
	}
	*/
	/*public SimpleMovieListener() {
		
	}*/

	public void showMovieFinder() {
		System.out.println("Movie to find is :"+ this.movieFinder.getMovieName());

	}


}
