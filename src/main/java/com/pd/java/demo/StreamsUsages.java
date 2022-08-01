package com.pd.java.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsages {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(StreamsUsages.class);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 8, 9, 9, 10);

		//Declarative style of programming - WHAT the program does?
		List<Integer> distinctList = integers.stream()
				.distinct().collect(Collectors.toList());
		logger.info("Distinct list from Integer array : {}",distinctList);


	}
}
