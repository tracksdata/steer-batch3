package com;

public class UseClass {

	public static void main(String[] args) {
		
		Shape rect=()->{
			System.out.println(">>>> Drawing Rect");
		};
		
		rect.draw();
		Shape circle=()->{
			System.out.println(">>> Drawing Circle");
		};
		Cart user1=itemCode->{
			System.out.println(">>>> "+itemCode+" added to Cart");
		};
		circle.draw();
		user1.addItem("I001");;

	}

}
