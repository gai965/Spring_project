package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public ArrayList<String> createList() {
		ArrayList<String> lists = new ArrayList<String>();

		for (int number = 0; number <= 100; number++) {

			if (number % 3 == 0 && number % 5 == 0) {
				lists.add("FizzBuzz");
			} else if (number % 3 == 0) {
				lists.add("Fizz");
			} else if (number % 5 == 0) {
				lists.add("Buzz");
			} else {
				lists.add(String.valueOf(number));
			}
		}
		return lists;
	}

}