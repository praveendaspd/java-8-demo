package com.pd.java.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (i) -> i % 6 == 0;
	static Predicate<Integer> p2 = (i) -> i % 2 == 0;

	public static void predicateAnd(){
		System.out.println("Predicate AND operation : "+p1.and(p2).test(10));
	}

	public static void predicateOr(){
		System.out.println("Predicate OR operation : "+p1.or(p2).test(6));
	}

	public static void main(String[] args) {

		Predicate<Integer> p = (i) -> i % 2 == 0;
		System.out.println(p.test(500));

		predicateAnd();
		predicateOr();
	}
}
