package com.tnsif.dayeight.functionalityinterface;

public class Functional {
	public static void main(String[] args) {
		Greetclass g = new Greetclass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}
