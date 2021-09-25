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
	}
	
	@Override
	public List<Greetings> getGreeting(){
		return greetingList;
	}




}
