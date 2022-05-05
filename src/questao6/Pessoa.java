package questao6;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome1, int idade1) {
		this.nome = nome1;
		this.idade = idade1;
	}
	
	public Pessoa(String nome2) {
		this.nome = nome2;
	}
	
	public void status() {
		System.out.println("Você cadastrou " + nome + " que possui " + idade + " anos.");
	}
	
	public void status2() {
		System.out.println("Você cadastrou " + nome + ".");
	}
}
