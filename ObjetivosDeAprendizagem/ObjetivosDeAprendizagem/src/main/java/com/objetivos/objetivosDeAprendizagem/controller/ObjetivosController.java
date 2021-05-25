package com.objetivos.objetivosDeAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivosDeAprendizagem() {
		return "Aprender o máximo sobre aplicações Spring"
				+ "\nMe adequar ao GitHub num projeto em grupo"
				+ "\nAperfeiçoar gestão de tempo";
	}

}
