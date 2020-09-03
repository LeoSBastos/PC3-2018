package br.com.prog3web.aula10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Primeiro extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<HTML><HEAD><TITLE>Primeiro Servlet");
		out.println("</TITLE></HEAD><BODY><CENTER>");
		out.println("<H1>Este é o meu primeiro Servlet.</H1>");
		out.println("</CENTER></BODY></HTML>");
		out.close();
	}
}
