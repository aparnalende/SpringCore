package com.demo.resourceAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class SimpleMovieListener {

	// @Resource
	@Resource(name = "movieFinder4")
	private MovieFinder movieFinder;
	int a = 20;

	public MovieFinder getMovieFinder() {
		return movieFinder;
	}

	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void showMovieFinder() {
		System.out.println("Movie to find is :" + this.movieFinder.getMovieName() +"  "+"A= "+this.a);

	}
@PostConstruct
	public void init() {
	System.out.println("Init SimpleMovieListener  called... " + this.a);
		this.a=50;
	}
@PreDestroy
	public void destory() {
		System.out.println(" Destory SimpleMovieListener  called... ");
	}

}
