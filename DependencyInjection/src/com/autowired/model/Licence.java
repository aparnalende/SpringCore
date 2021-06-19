package com.autowired.model;

import org.springframework.stereotype.Component;

@Component
public class Licence {
 private String number="123ABC456";

@Override
public String toString() {
	return "Licence [number=" + number + "]";
}
 
 
}
