package com.tq;

public class ByeByeWorld implements IWorld{
private String message;

public void getMessage() {
	System.out.println("Bye Bye World: "+message);
}

public void setMessage(String message) {
	this.message = message;
}

}
