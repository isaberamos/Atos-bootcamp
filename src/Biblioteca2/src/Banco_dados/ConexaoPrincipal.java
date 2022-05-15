package Banco_dados;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoPrincipal {
	
	public static void main(String[] args) throws SQLException {
		// Criação da classe BancoBiblioteca
		BancoBiblioteca bd = new BancoBiblioteca();
		
		String urlBD = "jdbc:mysql://localhost:3306/biblioteca?user=root&password=";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String queryBD = "select * from livro";
		ResultSet resultado;
		
		// Conexão ao BD
		System.out.println(bd.conectar(urlBD, driver));
		
		//Exclui um autor e nacionalidade que foram duplicados
		// System.out.println(bd.inserirAlterarExcluir("DELETE FROM autor WHERE id = 13"));

		resultado = bd.consultar("select * from livro");
		
		// Adicionando um novo autor
		//bd.inserirAlterarExcluir("INSERT INTO autor (nome, nacionalidade ) values ('Chico Buarque', 'Brasil')");
		
		// Adicionando uma nova categoria
		//bd.inserirAlterarExcluir("INSERT INTO categoria (tipo_categoria ) values ('Romance')");
		
		// Adicionando uma nova editora
		// bd.inserirAlterarExcluir("INSERT INTO editora (nome) values ('Civilização Brasileira')");
		
		// Adicionando a fk do autor e livro
		// bd.inserirAlterarExcluir("INSERT INTO livro_autor (fk_autor, fk_livro) values (7, '252987556324')");

		// Cadastrando um novo livro
		// bd.inserirAlterarExcluir("INSERT INTO livro (isbn, id_categoria, id_editora, titulo, ano ) values (252987556324, 3, 2, 'Fazenda Modelo', 1975)");
		
		// Altera uma informação do nome do autor
		//bd.inserirAlterarExcluir("UPDATE livro SET nome='Ciro Botelho', nacionalidade='Brasil' WHERE id=5");
		
		// Altera uma informação do nome do autor
		//bd.inserirAlterarExcluir("UPDATE livro SET id_categoria='4', id_editora='6' WHERE livro.ISBN ='252987556324';");
				
		// Caso o resultado procurado não seja nulo, imprime os dados no console
		if (resultado != null)
			System.out.println(">>>>>>> Seus títulos favoritos <<<<<<<");
			System.out.println("");
			while (resultado.next()) {
				System.out.println("ISBN: " + resultado.getString("ISBN") + "\t Código categoria: " + resultado.getString("id_categoria")+ "\t Código Editora: " + resultado.getString("id_editora") + "\t Título: " + resultado.getString("titulo")
						+ "\t Ano: " + resultado.getString("ano"));
			}		
	}
}

