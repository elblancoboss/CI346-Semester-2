package com.hussein.ci346;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FrontEnd {
	
	public static void main(String[] args) {
		SpringApplication.run(FrontEnd.class, args);
	}

	@RequestMapping("/")
	public String Index() {
		return "Hello World - Index Page";
	}
}