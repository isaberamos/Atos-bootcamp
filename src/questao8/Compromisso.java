package questao8;

import java.util.Scanner;

	public class Compromisso extends Pessoal {
			public String nome_compromisso;
			public String data;
			public String hora;
			
			public void exibirDados() {
				System.out.println(">>>>>>>>  MINHA AGENDA  <<<<<<<<<");
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Nome do compromisso: ");
				String nome_compromisso = entrada.nextLine();
				
				System.out.println("Data: ");
				String data = entrada.nextLine();
				
				System.out.println("Horário: ");
				String horario = entrada.nextLine();
				
				System.out.println("Compromisso: " + nome_compromisso);
				System.out.println("Data: "+ data);
				System.out.println("Horário: " + horario);
	}
}

