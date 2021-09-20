package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo2 {

	public static void main(String[] args) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameDay);
		
		

	}

}
