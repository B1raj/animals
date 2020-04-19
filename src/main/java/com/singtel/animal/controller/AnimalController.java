package com.singtel.animal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.animal.solution.Solution;

@RestController
public class AnimalController {

	@Autowired
	Solution solution;


	@RequestMapping("/solution")
	@GetMapping
	public void Solution() {
		solution.printAnimals();
	}

}
