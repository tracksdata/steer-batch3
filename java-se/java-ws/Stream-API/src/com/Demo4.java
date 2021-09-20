package com;

import java.util.Arrays;
import java.util.List;

class ArithmeticUtils {

	public static int add(int a, int b) {
		return a + b;
	}
}

public class Demo4 {
	public static void main(String[] args) {

		// List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		// Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
		// System.out.println(sum);
		
		//List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		//Integer sum = integers.stream().reduce(0, ArithmeticUtils::add);
		//System.out.println(sum);

		// List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		// Integer sum = integers.stream().reduce(0, Integer::sum);
		// System.out.println(sum);
		
		//List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		//Integer sum = integers.stream()
		//  .collect(Collectors.summingInt(Integer::intValue));
		//System.out.println(sum);
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream()
		  .mapToInt(Integer::intValue)
		  .sum();

		System.out.println(sum);

	}

}
