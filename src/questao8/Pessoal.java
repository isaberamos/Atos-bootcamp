package questao8;

import java.util.Scanner;

public class Pessoal extends Profissional{
	String compromisso_pessoal;
	
	public void exibeCompromissoPessoal() {
		
		System.out.println("Compromissos pessoais: ");
		Scanner entrada = new Scanner(System.in);
		String resposta = entrada.nextLine();
		System.out.println("Seus compromissos pessoais foram cadastrados com sucesso!");
		System.out.println("Compromissos pessoais: " + resposta);
			}
	
	}
