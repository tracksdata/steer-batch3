package com;

public class Paper {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public Paper(String subject) {
		System.out.println("Setting paper for " + subject);
		this.subject = subject;
	}

}
