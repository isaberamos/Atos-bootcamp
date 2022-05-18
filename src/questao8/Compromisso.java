package questao8;

import java.util.Scanner;

	public class Compromisso extends Pessoal {
			public String nome_compromisso;
			public String data;
			public String hora;
			
			public void atribuirValores (String nome_compromisso, String data, String hora) {
				//super.compromisso_pessoal = compromisso_pessoal;
				//super.compromisso_profissional = compromisso_profissional;
				this.nome_compromisso = nome_compromisso;
				this.data = data;
				this.hora = hora;
	}
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

