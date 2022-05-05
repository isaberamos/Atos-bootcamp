package quest4;

public class Carro {
	
		private String fabricante = "VW";
		private String modelo = "Gol";
		public void configuraDados(String fabricanteCarro, String modeloCarro) {
			fabricante = fabricanteCarro;
			modelo = modeloCarro;
		}
		public void exibirInformacoes() {
			System.out.println("Dados do carro: " + fabricante + modelo);
		}
		
}

