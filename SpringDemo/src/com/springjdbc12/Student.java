package com.springjdbc12;

public class Student {
	private int studid;
	private String sname;
	private String email;
	private String qualification;
	private int exp;

	public Student() {

	}

	public Student(String sname, String email, String qualification, int exp) {
		super();
		this.sname = sname;
		this.email = email;
		this.qualification = qualification;
		this.exp = exp;
	}

	public Student(int studid, String sname, String email, String qualification, int exp) {
		super();
		this.studid = studid;
		this.sname = sname;
		this.email = email;
		this.qualification = qualification;
		this.exp = exp;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", sname=" + sname + ", email=" + email + ", qualification="
				+ qualification + ", exp=" + exp + "]";
	}

}
