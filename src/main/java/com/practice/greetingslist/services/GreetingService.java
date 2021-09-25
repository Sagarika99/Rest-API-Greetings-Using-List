package com.practice.greetingslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.greetingslist.model.Greetings;

@Service
public class GreetingService implements GreetingInterface{

	public List<Greetings> greetingList;
	
	public GreetingService() {
		greetingList = new ArrayList<>();
		greetingList.add(new Greetings(1,"Sagarika","Shinde"));
		greetingList.add(new Greetings(2,"Saniya","Bhonde"));
		greetingList.add(new Greetings(3,"Meghana","Gupta"));
		
	}
	
	@Override
	public List<Greetings> getGreeting(){
		return greetingList;
	}

	@Override
	public Greetings getCourseById(long id) {
		Greetings g=null;
		for(Greetings greet : greetingList) {
			if(greet.getId()==id) {
				g=greet;
				break;
			}
		}
		return g;
	}

	@Override
	public Greetings addGreeting(Greetings greetings) {
		greetingList.add(greetings);
		return greetings;
	}




}
