package com.shrishti.autowiringjavabased;

import org.springframework.stereotype.Component;

public class Violin implements Instrument {

	@Override
	public void play(String song) {
		System.out.println(song+" is played by Violin");
	}

	

}
