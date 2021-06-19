package com.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//autowird setter method

@Component("driver")
public class Driver {
 private Licence licence;

 @Autowired
public void setLicence(Licence licence) {
	this.licence = licence;
}

@Override
public String toString() {
	return "Driver [licence=" + licence + "]";
}
 
 
}
