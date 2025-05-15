package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Os BSM's da Generation Brasil são:</b><br>"
				+ "1. Comunicação<br>" //ver
				+ "2. Responsabilidade Pessoal<br>"
				+ "3. Mentalidade de Crescimento<br>"
				+ "4. Orientação ao Detalhe<br>"//ver
				+ "5. Trabalho em Equipe<br>"
				+ "6. Orientação ao Futuro<br>"//ver
				+ "7. Proatividade<br>"
				+ "8. Comunicação<br>";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Objetivos de aprendizagem da semana: <br>"
				+ "Banco de dados;<br>"
				+ "Spring para desenvolvimento web;<br>"
				+ "Orientação ao detalhe;"
				+ "Proatividade.";
	}
	
}
