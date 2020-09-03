package br.com.prog3web.aula10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Segundo")
public class Segundo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Instrui o browser a respeito do tipo de conteúdo
		resp.setContentType("text/html");
		//Cria um objeto do tipo PrintWriter, para enviar mensagem ao browser
		PrintWriter out = resp.getWriter();
		// imprime estes dados no cliente
		out.println("<HTML><HEAD><TITLE>Primeiro Servlet");
		out.println("</TITLE></HEAD><BODY><CENTER>");
		out.println("<H1>Servlet mapeado por annotation.</H1>");
	}

}
