package com.pd.java.functional.interfaces;

import com.pd.java.data.Student;
import com.pd.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	static Consumer<Student> studentConsumer = (s) -> System.out.println(s);
	static Consumer<Student> studentConsumer1 = (s) -> System.out.print(s.getName());
	static Consumer<Student> studentConsumer2 = (s) -> System.out.println(s.getActivities());
	public static  void printName(){
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(studentConsumer);
	}

	public static void printNameAndActivities(){
		List<Student> studentList = StudentDataBase.getAllStudents();
		//Consumer chaining
		studentList.forEach(studentConsumer1.andThen(studentConsumer2));

	}

	public static void printNameAndActivitiesUsingConditions(){
		System.out.println("printNameAndActivitiesUsingConditions :");
		List<Student> studentList = StudentDataBase.getAllStudents();
		//Consumer chaining and reuse
		studentList.forEach(studentConsumer -> {
			if (studentConsumer.getGradeLevel() >= 3 && studentConsumer.getGpa() >= 4.0) {
				studentConsumer1.andThen(studentConsumer2).accept(studentConsumer);
			}
		});

	}

	public static void main(String[] args) {

		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		consumer.accept("Java 8");
		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingConditions();

	}
}
