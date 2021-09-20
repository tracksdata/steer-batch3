package com;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<String>();
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("CHENNAI");
		cities.add("BANGALORE");
		cities.add("KOLKATA");
		
		cities.forEach(cityName->{
			System.out.println(cityName);
		});
		
		System.out.println("=========================");
		
		cities.stream()
		.limit(3)
		.forEach(cityName->{
			System.out.println(cityName);
		});
		
		

	}

}
