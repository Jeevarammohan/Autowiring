package com.shrishti.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Performer {
	@Autowired //by type
	@Qualifier("violin")
	Instrument instrumentV;
	
	@Autowired //by name
	Instrument instrumentG;
	
	@Autowired
	@Qualifier("keyboard")
	Instrument instrumentK;
	public void playSong(String type,String song) {
		if(type.equals("violin")) 
			instrumentV.play(song);
		if(type.equals("guitar")) 
			instrumentG.play(song);
		if(type.equals("keyboard")) 
			instrumentK.play(song);
		
	}
}
