package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/*Exemplo aula */
@WebServlet(urlPatterns = {"/home","/create","/insert","/read","/delete"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    //Objeto de acesso ao Banco de Dados
	DAO dao = new DAO();
	
	//Objeto para armazenar dados temporariamente
	JavaBeans aluno = new JavaBeans();
	
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		if(action.equals("/home")) {
			response.sendRedirect("index.html");
			
		}else if (action.equals("/create")) {
			response.sendRedirect("cadastro.html");
			
		}else if (action.equals("/insert")) {
			adicionarAlunos(request, response);
			
		}else if (action.equals("/read")) {
			// Resgatar todos os registros do banco de dados
			listarAlunos(request, response);
		}
		else if (action.equals("/delete")) {
			// Remover o registro do banco de dados
			removerAlunos(request, response);
		}
		
	}
	// M�todo para adicionar alunos
	protected void adicionarAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nome:" + request.getParameter("nome") );
		aluno.setId(request.getParameter("id"));
		aluno.setNome(request.getParameter("nome"));
		aluno.setEmail(request.getParameter("email"));
		aluno.setFone(request.getParameter("fone"));
		
		dao.inserirAluno(aluno);
		
		response.sendRedirect("read");
	}
	
		// M�todo para listar os alunos
	protected void listarAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Criando uma lista para objetos JavaBeans, ou seja, uma lista de alunos
		// A vari�vel lista � do tipo ArrayList, onde os elementos do ArrayList s�o do tipo JavaBeans(id, nome etc)
		ArrayList<JavaBeans> lista = dao.listarAlunos();
		request.setAttribute("alunos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("alunos.jsp");
		rd.forward(request, response);	
	}
	
	protected void removerAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		aluno.setId(id);
		// Deleta um registro
		dao.deletarAluno(aluno);
		// Gera uma nova pagina din�mica
		response.sendRedirect("read");
	}
}