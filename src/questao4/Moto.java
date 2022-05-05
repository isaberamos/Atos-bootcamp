package questao4;

public class Moto {
		public String marca;
		public String modelo;
		public int cilindrada;

		public void setDados(String marca, String modelo, int cilindrada) {
			this.marca = marca;
			this.modelo = modelo;
			this.cilindrada = cilindrada;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public String getModelo() {
			return modelo;
		}
		
		public int getCilindrada() {
			return cilindrada;
		}
		
		public void status() {
			System.out.println("Moto " + getMarca() + " do modelo " + getModelo() + " com " + getCilindrada() + " cilindradas foi criada!");
		}

}

