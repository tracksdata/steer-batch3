package com;

@FunctionalInterface
interface Person{
	
	void add();
	
	default void f1() { // non static / instance
		System.out.println(">>> f1 method");
	}
	static void f2() {
		System.out.println("f2 method");
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		
		Person p= ()->{
			System.out.println(">>>>>> add method of Person ");
		};
		
		//System.out.println(System.identityHashCode(p));
		
		p.add();
		p.f1();
		
		Person.f2();
		
	}

}
