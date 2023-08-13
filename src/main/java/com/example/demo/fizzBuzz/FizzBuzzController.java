package com.example.demo.fizzBuzz;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzbuzz")
	public String multi(Model model) {
		ArrayList<String> result = new ArrayList<String>();

		result = fizzBuzzService.createList();

		model.addAttribute("result", result);

		return "fizzBuzz";
	}
}