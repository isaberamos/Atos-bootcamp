package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BancoBiblioteca {
	
	public Connection conexao;
	
	public String conectar(String URL, String Driver) {
		try {
			Class.forName(Driver);
			conexao = (Connection) DriverManager.getConnection(URL);
			return "Conectado";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "N�o foi Poss�vel Conectar ";
		}
	}
	
	public ResultSet consultar(String query) {
		Statement st;
		ResultSet resultado = null;
		try {
			st = conexao.createStatement();
			resultado = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public int inserirAlterarExcluir(String query) {
		int linhas = 0;
		try {
			Statement st = conexao.createStatement();
			linhas = st.executeUpdate(query);
			System.out.println("Opera��o Efetuada com Sucesso");
			return linhas;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Opera��o N�o Efetuada");
		}
		return linhas;
	}
}
