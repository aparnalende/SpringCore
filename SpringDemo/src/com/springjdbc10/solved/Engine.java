package com.springjdbc10.solved;

public class Engine {
	private int eid;
	private String engineType;

	Engine() {
		System.out.println("in Engine constructor");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Engine(int eid, String engineType) {
		super();
		System.out.println("in Engine constructor");
		this.eid = eid;
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", engineType=" + engineType + "]";
	}

}
