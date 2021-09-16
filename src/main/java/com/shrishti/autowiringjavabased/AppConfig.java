package com.shrishti.autowiringjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean
	public Keyboard keyboard() {
		return new Keyboard();
	}

	@Bean
	public Violin violin() {
		return new Violin();
	}

	@Bean
	@Primary
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Performer performer() {
		return new Performer();
	}
	
}
