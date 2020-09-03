package br.com.prog3web.aula10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Preferencia")
public class FrutaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String nome;
		String frutas[];
		nome = req.getParameter("nome");
		frutas = req.getParameterValues("fruta");
		out.println("<HTML><HEAD><TITLE>Primeiro Servlet");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>Servlet com dados do form</H1>");
		out.println("<BR><p>Bom dia " + nome + "!</p> <br>");
		if (frutas == null)
			out.println("<BR>Você não gosta de frutas ! ");
		else {
			String resposta = "Voce gosta das seguintes frutas :<BR>" + "<UL>";
			for (int i = 0; i < frutas.length; i++)
				resposta += "<LI>" + frutas[i] + "</LI>";
			resposta += "</UL>";
			out.println(resposta);
		}
		out.println("<BR></BODY></HTML>");
		out.close();
	}

}
