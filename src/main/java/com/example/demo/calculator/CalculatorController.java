package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("input")
	public String doGet() {
		return "calculator";
	}

	@GetMapping("calculator")
	public String doGet(@RequestParam("leftOperant") String leftOperant,
			@RequestParam("rightOperant") String rightOperant,
			@RequestParam("operator") String operator, Model model) {

		int result = calculatorService.calculate(Integer.parseInt(leftOperant), Integer.parseInt(rightOperant),
				operator);
		model.addAttribute("result", result);

		return "calculator";
	}
}
