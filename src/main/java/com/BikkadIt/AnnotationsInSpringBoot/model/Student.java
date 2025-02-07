package com.BikkadIt.AnnotationsInSpringBoot.model;

public class Student {

	public Student() {
		super();
		System.out.println("Student Class Constructor");
	}

	private int sid;
	
	private String sname;
	
	private String saddr;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	@Override
	public String toString() {
		return "StudentController [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}
	
}
