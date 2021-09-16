package com.shrishti.autowiringjavabased;

import org.springframework.stereotype.Component;

public class Guitar implements Instrument {

	@Override
	public void play(String song) {
		System.out.println(song+" is played by Guitor");
	}

}
