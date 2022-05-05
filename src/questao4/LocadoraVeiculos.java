package questao4;

import java.util.Scanner;

public class LocadoraVeiculos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*****CADASTRO DE VEÍCULOS*****");
		System.out.println("Insira [M] para Moto ou [C] para carro");
		String resposta = entrada.nextLine();
		
		while (!resposta.equals("m") && !resposta.equals("c"))  {
				
		}
			if (resposta.equals("m")) {
				
				Moto moto = new Moto();
				System.out.println("Marca: ");
				String marca = entrada.nextLine();
				System.out.println("Modelo: ");
				String modelo = entrada.nextLine();
				System.out.println("Cilindradas: ");
				int cilindrada = entrada.nextInt();
				moto.setDados(marca, modelo, cilindrada);
				moto.status();				
	
			} 
			else if (resposta.equals("c")); {
				Carro carro = new Carro();
				System.out.println("Marca: ");
				String marca = entrada.next();
				System.out.println("Modelo: ");
				String modelo = entrada.next();
				carro.setDados(marca, modelo);
				carro.status();
				System.out.println("*****SAINDO DO PROGRAMA*****");
				}	
			
			}
		}

