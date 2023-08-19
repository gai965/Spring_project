package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculate(int num1, int num2, String operator) {
		int result = 0;

		switch (operator) {
		case "addition":
			result = num1 + num2;
			break;
		case "subtraction":
			result = num1 - num2;
			break;
		case "multiplication":
			result = num1 * num2;
			break;
		case "division":
			result = num1 / num2;
			break;
		}
		return result;
	}
}
