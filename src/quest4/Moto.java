package quest4;

public class Moto {
		private String marca;
		private String modelo;
		private int cilindradas;
		public void configuraDados(String marcaMoto, String modeloMoto, int quantCilindradas) {
			marca = marcaMoto;
			modelo = modeloMoto;
			cilindradas = quantCilindradas;
		}
		public void exibirInformacoes() {
			System.out.println("Dados da moto: " + marca + modelo + cilindradas);
		}
		
}
