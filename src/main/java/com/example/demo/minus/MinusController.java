package com.example.demo.minus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("display")
	public String doGet() {
		return "minus";
	}

	@GetMapping("minus")
	public String doGet(@RequestParam("subtrahend") String subtrahend, @RequestParam("minuend") String minuend,
			Model model) {

		int result = minusService.minus(Integer.parseInt(subtrahend), Integer.parseInt(minuend));
		model.addAttribute("result", result);

		return "minus";
	}

}