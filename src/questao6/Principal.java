package questao6;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.println("*****CADASTRO DE PESSOA*****");
			System.out.println("Quer cadastrar (1)Nome e idade ou somente (2)Nome ?");
			String opcao = entrada.nextLine();
			if (opcao.equals("1")) {
				System.out.println("Nome: ");
				String nome1 = entrada.nextLine();
				System.out.println("Idade: ");
				int idade1 = entrada.nextInt();
				Pessoa pessoa = new Pessoa(nome1, idade1);
				pessoa.status();
			}
			else if (opcao.equals("2")) {
				System.out.println("Nome: ");
				String nome2 = entrada.nextLine();
				Pessoa pessoa = new Pessoa(nome2);
				pessoa.status2();
			}
	}
	
}