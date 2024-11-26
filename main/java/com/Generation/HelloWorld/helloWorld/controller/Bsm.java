package com.Generation.HelloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class Bsm {
	@GetMapping
	public String bsm() {
		return "Persistência\",\r\n"
				+ "                \"Responsabilidade Pessoal\",\r\n"
				+ "                \"Mentalidade de Crescimento\",\r\n"
				+ "                \"Orientação ao Futuro\",\r\n"
				+ "                \"Trabalho em Equipe\",\r\n"
				+ "                \"Orientação ao Detalhe\",\r\n"
				+ "                \"Proatividade\",\r\n"
				+ "                \"Comunicação\"";
	}
}
