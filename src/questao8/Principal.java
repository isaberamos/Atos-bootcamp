package questao8;

/* Crie uma classe Compromisso que possui os atributos nome (do compromisso), data e hora. 
A classe Compromisso � herdada pelas classes Profissional e Pessoal que possuem uma interface de acesso. 
Al�m disso, a classe Profissional possui o m�todo exibeCompromissoProfissional() 
e a classe Pessoal possui o m�todo exibeCompromissoPessoal(). 
Ambos os m�todos dever�o ser implementados em uma classe Principal, 
que tamb�m far� a leitura dos valores dos atributos e as suas respectivas impress�es na tela. */


public class Principal extends Compromisso {
	public static void main(String[]args) {
		
		Compromisso c1 = new Compromisso();
		c1.exibirDados();
		c1.exibeCompromissoPessoal();
		c1.exibeCompromissoProfissional();
	}
}
