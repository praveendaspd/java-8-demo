package com.pd.java.functional.interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String,String> biConsumer = (a,b) -> {
			System.out.println("First name is :"+ a + " Last name is : "+b);
		};

		biConsumer.accept("Praveen" , "Das");

		BiConsumer<Integer,Integer> multiply = (a,b) -> {
			System.out.println("Multiplication is " + a * b);
		};

		BiConsumer<Integer,Integer> division = (a,b) -> {
			System.out.println("Division is " + a / b);
		};

		multiply.andThen(division).accept(10,5);
	}
}
