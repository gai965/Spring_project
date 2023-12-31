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
	public String animalSearch(Model model) throws IOException {
		List<Animals> animalsList = animalsApiService.getAnimalsList();
		
		model.addAttribute("animalsList", animalsList);

		return "animalsearch";
	}

	@GetMapping("animalResults")
	public String animalResults(@RequestParam("animalNumber") String animalNumber, Model model) throws IOException {
		List<Animals> animalsList = animalsApiService.getAnimalsDetail(animalNumber);

		model.addAttribute("animalsList", animalsList);

		return "animalresults";
	}

}
