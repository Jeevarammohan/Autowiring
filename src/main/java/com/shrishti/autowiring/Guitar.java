package com.shrishti.autowiring;

import org.springframework.stereotype.Component;

@Component("instrumentG")
public class Guitar implements Instrument {

	@Override
	public void play(String song) {
		System.out.println(song+" is played by Guitor");
	}

}
