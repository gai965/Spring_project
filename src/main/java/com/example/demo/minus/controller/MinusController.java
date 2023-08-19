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
	public String doGet(@RequestParam("minuend") String minuend, @RequestParam("subtrahend") String subtrahend,
			Model model) {

		int result = minusService.minus(Integer.parseInt(minuend), Integer.parseInt(subtrahend));
		model.addAttribute("result", result);

		return "minus";
	}

}