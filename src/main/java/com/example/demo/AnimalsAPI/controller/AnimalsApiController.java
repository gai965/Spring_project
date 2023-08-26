package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.service.AnimalsApiService;
import com.example.demo.AnimalsAPI.data.Animals;

@Controller
public class AnimalsApiController {

	private final AnimalsApiService animalsApiService;

	public AnimalsApiController(AnimalsApiService animalsApiService) {
		this.animalsApiService = animalsApiService;
	}

	@GetMapping("animalSearch")
	public String animalSearch() {
		return "animalsearch";
	}

	@GetMapping("animalResults")
	public String animalResults(@RequestParam("animalnumber") String animalnumber, Model model) throws IOException {
		List<Animals> animalsList = animalsApiService.getAnimals(animalnumber);

		model.addAttribute("animalsList", animalsList);

		return "animalresults";
	}

}
