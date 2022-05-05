package carro;

public class Carro {

	public String fabricante = "VW";
	public String modelo = "Gol";
	public void configuracaoDados(String fabricanteCarro, String modeloCarro) {
		fabricante = fabricanteCarro;
		modelo = modeloCarro;
	}
	public void exibirInformacoes() {
		System.out.println("Dados do carro: " + fabricante + " " + modelo);
	}
}
