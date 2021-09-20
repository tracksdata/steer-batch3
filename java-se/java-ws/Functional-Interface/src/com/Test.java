package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("Abc","Xyz","test","Hyd");
		
		
		Predicate<Integer> c1=i->(i<=100);
		Predicate<String> c2=str->(str.equals("Praveen"));
		
		System.out.println(c1.test(670));
		System.out.println(c2.test("Praveen"));
		
		
		
		
		
		

	}

}
