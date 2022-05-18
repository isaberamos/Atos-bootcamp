package questao8;

/* Crie uma classe Compromisso que possui os atributos nome (do compromisso), data e hora. 
A classe Compromisso é herdada pelas classes Profissional e Pessoal que possuem uma interface de acesso. 
Além disso, a classe Profissional possui o método exibeCompromissoProfissional() 
e a classe Pessoal possui o método exibeCompromissoPessoal(). 
Ambos os métodos deverão ser implementados em uma classe Principal, 
que também fará a leitura dos valores dos atributos e as suas respectivas impressões na tela. */


public class Principal extends Compromisso {
	public static void main(String[]args) {
		
		Compromisso c1 = new Compromisso();
		c1.exibirDados();
		c1.exibeCompromissoPessoal();
		c1.exibeCompromissoProfissional();
	}
}
