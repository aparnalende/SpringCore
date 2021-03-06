package com.restapi.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.project.model.User;
import com.restapi.project.service.UserService;

@RestController
public class HelloWorldRestController {

	@Autowired
	UserService userService;
	
	 @RequestMapping(value = "/user/", method = RequestMethod.GET)
	    public ResponseEntity<List<User>> listAllUsers() {
	        List<User> users = userService.findAllUsers();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }
	 
}
