package com.example.demo.AnimalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.repository.AnimalsApiRepository;

@Service
public class AnimalsApiService {
	private final AnimalsApiRepository animalsApiRepository;

	public AnimalsApiService(AnimalsApiRepository animalsApiRepository) {
		this.animalsApiRepository = animalsApiRepository;
	}

	public List<Animals> getAnimals(String animalNumber) throws IOException {
		Animals[] animalsList = animalsApiRepository.getAnimals(animalNumber);

		return Arrays.asList(animalsList);
	}

}
