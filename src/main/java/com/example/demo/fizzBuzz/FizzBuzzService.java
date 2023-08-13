package com.example.demo.fizzBuzz;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public ArrayList<String> createList() {
		ArrayList<String> lists = new ArrayList<String>();
		String string = "";

		for (int number = 1; number <= 100; number++) {
			string = String.valueOf(number) + "：";

			if (number % 3 == 0 && number % 5 == 0) {
				string += "FizzBuzz";
			} else if (number % 3 == 0) {
				string += "Fizz";
			} else if (number % 5 == 0) {
				string += "Buzz";
			}
			lists.add(string);
		}

		return lists;
	}

}