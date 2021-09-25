package com.practice.greetingslist.services;

import java.util.List;

import com.practice.greetingslist.model.Greetings;

public interface GreetingInterface {

	public List<Greetings> getGreeting();

	public Greetings getCourseById(long id);

	public Greetings addGreeting(Greetings greetings);

	public Greetings editGreeting(long parseLong, Greetings greetings);

}
