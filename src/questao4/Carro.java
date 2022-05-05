package questao4;

public class Carro {
		public String marca;
		public String modelo;
		
		public void setDados(String marca, String modelo) {
			this.marca = marca;
			this.modelo = modelo;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public String getModelo() {
			return modelo;
		}

		public void status() {
			System.out.println("Carro da marca " + getMarca() + " do modelo " + getModelo() + " foi criado!");
		}

}
