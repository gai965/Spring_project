package com.example.demo.AnimalsAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.AnimalsAPI.data.Animals;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalsApiRepository {

	public Animals[] getAnimals(String animalnumber) throws IOException {
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi?id=" + animalnumber;

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> response = rest.getForEntity(url, String.class);

		String json = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animals[] animalsList = mapper.readValue(json, Animals[].class);

		return animalsList;
	}

}
