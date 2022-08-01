package com.pd.java.functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void printNameAndActivities(){

		BiConsumer<String, List<String>> biConsumer2 = (name , activities) -> {
			System.out.println("Name is " + name +". Activities are "+ activities);
		};

		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> biConsumer2.accept(student.getName(), student.getActivities()));

	}

	public static void main(String[] args) {


		BiConsumer<String,String> biConsumer = (a,b) -> {
			System.out.println("First name is :"+ a + " Last name is : "+b);
		};

		biConsumer.accept("Praveen" , "Das");

		printNameAndActivities();

		BiConsumer<Integer,Integer> multiply = (a,b) -> {
			System.out.println("Multiplication is " + a * b);
		};

		BiConsumer<Integer,Integer> division = (a,b) -> {
			System.out.println("Division is " + a / b);
		};

		multiply.andThen(division).accept(10,5);


	}
}
