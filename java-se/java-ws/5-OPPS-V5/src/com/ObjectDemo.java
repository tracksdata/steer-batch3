package com;

public class ObjectDemo {

	public static void main(String[] args) {

		String s1 = "Abc";

		//System.out.println("S1 Hashcode: " + s1.hashCode());
		System.out.println("S1 Hashcode: "+System.identityHashCode(s1));
		System.out.println("S1: " + s1);

		String s2 = new String("Abc");

		//System.out.println("S2 Hashcode: " + s2.hashCode());
		System.out.println("S2 Hashcode: "+System.identityHashCode(s2));
		System.out.println("S2: " + s2);
		
		// Note: == operator always compares hash code of objects
		// Note: equals compares always content of objects

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
