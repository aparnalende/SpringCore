package com.day8.solved;

public class Batch {
	private int bid;
	private String bname;
	private String Tname;

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", Tname=" + Tname + "]";
	}

	public Batch(int bid, String bname, String tname) {
		super();
		this.bid = bid;
		this.bname = bname;
		Tname = tname;
	}

	public Batch() {
		System.out.println("in default const of batch");
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

}
