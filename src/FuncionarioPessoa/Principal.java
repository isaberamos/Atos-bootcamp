package questao7;

public class Principal {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
			
		f1.atribuirValores("Ambiental", "Bi�logo", "Funcion�rio f1", "Ana Ribeiro", 25, "47996666828");
		f2.atribuirValores("Social", "Fil�sofo", "Funcion�rio f2", "Ricardo Antunes", 65, "45995585755");
		
		f1.exibirDados();
		f2.exibirDados();
	}
}
