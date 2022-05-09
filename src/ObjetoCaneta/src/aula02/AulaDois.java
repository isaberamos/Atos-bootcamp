package aula02;
public class AulaDois {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.carga = 90;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Pilot";
		c2.cor = "Roxa";
		c2.carga = 85;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
	
}