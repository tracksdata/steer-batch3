package com;

import java.util.Arrays;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class Tes {
	
	 void  f1(int x) {
		 if(x==11) {
			 return;
		 }
		 
		 System.out.println(x);
		 x++;
		 f1(x); 
	 }

	public static void main(String[] args) {
		new Tes().f1(1);
		
		System.out.println("============================");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		Person p1=new Person(10, "Abc");
		Person p2=new Person(11, "Xyz");
		Person p3=new Person(12, "Aac");
				
		List<Person> persons = Arrays.asList(p1,p2,p3);
		
		for(Person person:persons) {
			System.out.println(person);
		}
		
		System.out.println("====================================");
		persons.forEach(person->{ // 
			System.out.println(person);
		});
		
		
		System.out.println("======================================");
		
		persons.forEach(System.out::println);
		
		
	
		 
		
		
		
		

	}

}
