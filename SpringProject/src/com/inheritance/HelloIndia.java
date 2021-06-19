package com.inheritance;

public class HelloIndia extends HelloWorld {
	private String message3;

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	@Override
	public String toString() {
		return "HelloIndia [message3=" + message3 + ", Message1=" + getMessage1() + ", Message2="
				+ getMessage2() + "]";
	}
}
