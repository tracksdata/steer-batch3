package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo3 {
	public static void main(String[] args) {

		
		LocalDate date=LocalDate.now();
		
		String d1 = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(d1);
		String d2 = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(d2);
		String d3 = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(d3);
		String d4 = date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(d4);
		String d5 = date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
		System.out.println(d5);

		

	}

}
