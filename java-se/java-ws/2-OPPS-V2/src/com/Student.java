package com;

public class Student {

	private int regId;
	private String name;

	

	public Student(int regId, String name) {
		this.regId = regId;
		this.name = name;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
