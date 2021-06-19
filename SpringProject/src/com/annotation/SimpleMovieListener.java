package com.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Repository
@Service
@Controller
public class SimpleMovieListener {

//@Autowired
//	@Autowired(required=false)
//	@Resource
	private MovieFinder movieFinder;

//	@Autowired
//	private MessageSource messageSource;

	public MovieFinder getMovieFinder() {
		return movieFinder;
	}

	@Autowired
//	@Qualifier("movie1")
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

//public SimpleMovieListener() {
//	
//}
////@Autowired(required=false)
//public SimpleMovieListener(MovieFinder tempMovieFinder) {
//	this.movieFinder=tempMovieFinder;
//}
	public void showMovieFinder() {
		System.out.println("Movie to find is :" + this.movieFinder.getMovieName());
	}

	
}
