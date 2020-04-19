package com.singtel.animal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.animal.bean.Response;
import com.singtel.animal.service.AnimalService;
import com.singtel.animal.solution.Solution;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	Solution solution;


	@RequestMapping("/solution")
	@GetMapping
	public void Solution() {
		solution.printAnimals();
	}
	
	@Autowired
	AnimalService animalService;

	@RequestMapping("/count")
	@GetMapping
	private ResponseEntity<Response> getAnimalCount(HttpServletRequest request) {
		return new ResponseEntity<>(animalService.countAnimals(new Response()), HttpStatus.OK);
	}

}
