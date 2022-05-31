package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.beans.Produto;
import com.example.restservice.beans.Saudacoes;


@RestController
public class Controller { 
	
	private static final String template = "Olá, %s!"; //Criando um template de mensagem
	private final AtomicLong counter1 = new AtomicLong(); // Contador que fica responsável por incrementar o valor ID
	private final AtomicLong counter2 = new AtomicLong(); // Contador que fica responsável por incrementar o valor ID

	
	/* @GetMapping("/saudacoes") //Mapping de getRequest
	// Recebendo http://localhost:8080/saudacoes?nome="Joao"
	public Saudacoes saudacoes(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) { //Retornando o JSON
		System.out.println(nome); 
		return new Saudacoes(counter1.incrementAndGet(), String.format(template, nome));
	} */
	
	@GetMapping("/produto") //Mapping de getRequest
	// Recebendo http://localhost:8080/produto/produto?nome=moletom&tipo=roupa
	public Produto produto(@RequestParam(value = "nome") String nome, @RequestParam(value = "tipo") String tipo) { //Retornando o JSON
		System.out.println(nome);
		System.out.println(tipo);							
		return new Produto(counter2.incrementAndGet(), nome, tipo);
		
	}
}
