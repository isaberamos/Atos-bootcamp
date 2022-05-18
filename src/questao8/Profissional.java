package questao8;

import java.util.Scanner;

public class Profissional {
	String compromisso_profissional;

	public void exibeCompromissoProfissional() {
			
		System.out.println("Compromissos profissionais: ");
		Scanner entrada = new Scanner(System.in);
		String resposta = entrada.nextLine();
		System.out.println("Seus compromissos profissionais foram cadastrados com sucesso!");
		System.out.println("Compromissos profissionais: " + resposta);
		
	}
}
