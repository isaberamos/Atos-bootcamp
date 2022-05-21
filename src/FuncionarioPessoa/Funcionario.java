package questao7;

public class Funcionario extends Pessoa {
	public String setor;
	public String cargo;
	public String funcao;
	
	public void atribuirValores(String setor, String cargo, String funcao, String nome, int idade, String telefone) {
		super.nome = nome;
		super.idade = idade;
		super.telefone = telefone;
		this.setor = setor;
		this.cargo = cargo;
		this.funcao = funcao;
	}
	public void exibirDados() {
		System.out.println("Nome: " + super.nome);
		System.out.println("Idade: " + super.idade);
		System.out.println("Telefone: " + super.telefone);
		System.out.println("Setor" + this.setor);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Função: " + this.funcao);
	}
}
