package com.Generation.HelloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivos() {
		return "Aprender Spring Boot\",\r\n"
				+ "                \"Melhorar habilidades em programação\",\r\n"
				+ "                \"Praticar SQL\",\r\n"
				+ "                \"Compreender o uso de APIs REST\",\r\n"
				+ "                \"Praticar lógica de programação\"";
	}
}
