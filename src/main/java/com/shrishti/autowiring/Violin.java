package com.shrishti.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument {

	@Override
	public void play(String song) {
		System.out.println(song+" is played by Violin");
	}

	

}
