package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Arpit";
		System.out.println(supplier.get());
		
		Supplier<List<String>> s2=()->Arrays.asList("HYD","Pune","Mumbai");
		
		s2.get().forEach(System.out::println);
		
	}
}
