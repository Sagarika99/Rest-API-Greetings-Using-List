package com.practice.greetingslist.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.greetingslist.model.Greetings;
import com.practice.greetingslist.services.GreetingInterface;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Autowired
	private GreetingInterface greetingList;	
	
	@RequestMapping("/jSon")
	public List<Greetings> addGreetings(){
		return Arrays.asList(
				new Greetings(1,"Sagarika","Shinde"),
				new Greetings(2,"Saniya","Bhonde")
						);
	}
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + "!";
	}
	
	@GetMapping("/sayHello")
	public List<Greetings> getGreeting() {
		return this.greetingList.getGreeting();
	}
	
	@GetMapping("/sayHello/{id}")
	public Greetings getCourseById(@PathVariable String id) {
		return this.greetingList.getCourseById(Long.parseLong(id));
	}
	
	@PostMapping("/sayHello")
	public Greetings addGreeting(@RequestBody Greetings greetings) {
		return this.greetingList.addGreeting(greetings);
	}
	
	@PutMapping("/sayHello/{id}")
	public Greetings editGreeting(@PathVariable String id, @RequestBody Greetings greetings) {
		return this.greetingList.editGreeting(Long.parseLong(id),greetings); 
	}
}
