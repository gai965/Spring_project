package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {

	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minusInput")
	public String doGet() {
		return "minus";
	}

	@GetMapping("minusResult")
	public String doGet(@RequestParam("minuend") int minuend, @RequestParam("subtrahend") int subtrahend,
			Model model) {

		int result = minusService.minus(minuend, subtrahend);
		model.addAttribute("result", result);

		return "minus";
	}

}