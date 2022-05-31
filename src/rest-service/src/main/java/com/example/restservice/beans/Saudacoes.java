package com.example.restservice.beans;
// O beans guarda a base de informações

public class Saudacoes {
	
	private final long id; // O "final" quando colocado em um atributo, a cada vez que é executado um objeto, só poderá ter um único valor
	private final String texto;
	
	public Saudacoes(long id, String texto) { //Ao criar um objeto do tipo saudações e passar um id e um texto, vai estar setando os valores
		this.id = id;
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}
	
}
