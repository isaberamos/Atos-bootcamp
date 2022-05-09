package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	void status() {
		System.out.print("Modelo: " + this.modelo);
		System.out.print("Uma caneta " + this.cor);
		System.out.print("Ponta: " + this.ponta);
		System.out.print("Carga: " + this.carga);
		System.out.print("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.print("Erro! Não posso rabiscar");
			} else {
				System.out.print("Estou rabiscando");
			}
			 
		}
	
	public void tampar() {
		this.tampada = true;
		
	}
	
	public void destampar() {
		
	}
}
	