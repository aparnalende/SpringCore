package com.springjdbc10.solved;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

public class Car {
	private String modelname;
	private int cost;
	private Engine engine;

	Car() {
		System.out.println("in car constructor");
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	/*
	 * abstract public Engine getEngine();
	 */

	@Lookup
	public Engine getEngine() {
		return null;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [modelname=" + modelname + ", cost=" + cost + ", engine=" + engine + "]";
	}

}
