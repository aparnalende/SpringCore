package com.resource.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.resource.model.ApplicationUser;

//autowiring by name

@Component("application")
public class Application {
	@Resource(name="applicationUser")
	private ApplicationUser user;

	@Override
	public String toString() {
		return "Application [user=" + user + "]";
	}

	
	
}
