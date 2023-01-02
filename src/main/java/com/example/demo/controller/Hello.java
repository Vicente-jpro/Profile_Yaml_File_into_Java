package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

	@Value("${system.name}")
	private String valueFromApplicationPropertiesFile;
	
	@GetMapping("/hello")
	public String hello() {
		return valueFromApplicationPropertiesFile;
	}
}
