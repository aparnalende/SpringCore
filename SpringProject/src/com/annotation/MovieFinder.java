package com.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class MovieFinder {
private String movieName;

public String getMovieName() {
	return movieName;
}

@Required
public void setMovieName(String movieName) {
	this.movieName = movieName;
}

@PostConstruct
public void init() {
	System.out.println("init SimpleMovieListener");
}

@PreDestroy
public void destroy() {
	System.out.println("destroy SimpleMovieListener");
}
}
