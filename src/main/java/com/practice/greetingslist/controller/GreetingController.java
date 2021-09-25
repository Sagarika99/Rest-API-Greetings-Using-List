package com.practice.greetingslist.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.greetingslist.model.Greetings;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@RequestMapping("/jSon")
	public List<Greetings> getGreetings(){
		return Arrays.asList(
				new Greetings("Sagarika","Shinde"),
				new Greetings("Saniya","Bhonde")
						);
	}
	
}
