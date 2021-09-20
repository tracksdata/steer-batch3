package com;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> stringList = Arrays.asList(20,4,12,8,10);
		 
        stringList.stream()
                   .map((num) -> num * 2) // modify stream object
                   .map((num) -> num + 10)
                   //.limit(3)
                   //.skip(2)
                   //.sorted()
                   .forEach(System.out::println);
                   
	}

}
