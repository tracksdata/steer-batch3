package com;

public class Exam {

	private Paper paper; // has 'A'

	public Paper getPaper() {
		return paper;
	}

	public Exam(Paper paper) {
		System.out.println("Conduting exam on " + paper.getSubject());
		this.paper = paper;
	}

}
