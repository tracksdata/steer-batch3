package com;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		
		//Stream<String> s1=Arrays.asList("Praveen","James","Alex","Bucky").stream();
		//System.out.println(s1.count());
		List<Integer> itemPrice = Arrays.asList(34000,87,33,15000,23000,5000,3212);
		
		List<Integer> c1 = itemPrice.stream()
		.filter(price->price>=10000).collect(Collectors.toList());
		Set<Integer> c2 = itemPrice.stream()
		.filter(price->price>=10000).collect(Collectors.toSet());
		
		System.out.println(itemPrice);
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
		

	}

}
