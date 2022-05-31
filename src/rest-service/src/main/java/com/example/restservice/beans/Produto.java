package com.example.restservice.beans;

public class Produto {
	
	private final long id; // O "final" quando colocado em um atributo, a cada vez que é executado um objeto, só poderá ter um único valor
	private String nome;
	private String tipo;
	
	public Produto(long id, String nome, String tipo) { //Ao criar um objeto do tipo produto e passar um id e um texto, vai estar setando os valores
		
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
}
