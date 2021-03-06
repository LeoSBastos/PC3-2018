<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDate"%>
<%@page import="br.com.prog3.rh.util.Util"%>
<%@page import="br.com.prog3.rh.controller.DependenteController"%>
<%@page import="br.com.prog3.rh.negocio.Dependente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DependenteCRUD</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: center;
}
</style>
</head>
<body>
	<%
		switch (request.getParameter("submit")) {
		case "inserir":
			Dependente dep = new Dependente();
			DependenteController dc = new DependenteController();
			dep.setCpfEmpregado(request.getParameter("cpf"));
			dep.setNome(request.getParameter("nome"));
			int[] dataFormatada = Util.formatarDataDeGuiParaLocalDate(request.getParameter("data"));
			dep.setDataNascimento(LocalDate.of(dataFormatada[2], dataFormatada[1], dataFormatada[0]));
			dep.setGrauParentesco(request.getParameter("grau"));
			out.print(dc.inserir(dep));
			break;
		case "alterar":
			dep = new Dependente();
			dc = new DependenteController();
			dep.setCpfEmpregado(request.getParameter("cpf"));
			dep.setNome(request.getParameter("nome"));
			dataFormatada = Util.formatarDataDeGuiParaLocalDate(request.getParameter("data"));
			dep.setDataNascimento(LocalDate.of(dataFormatada[2], dataFormatada[1], dataFormatada[0]));
			dep.setGrauParentesco(request.getParameter("grau"));
			out.print(dc.alterar(dep));
			break;
		case "excluir":
			dep = new Dependente();
			dc = new DependenteController();
			dep.setCpfEmpregado(request.getParameter("cpf"));
			break;
		case "visualizar":
	%>
	<p>Aqui estão as informações recebidas</p>
	<table style="width: 100%">
		<tr>
			<th>CPF do Empregado</th>
			<th>Nome</th>
			<th>Grau de Parentesco</th>
			<th>Data de nascimento</th>
		</tr>

		<%
			List<Dependente> listaDep = new ArrayList<>();
				dc = new DependenteController();
				listaDep = dc.listarTodos();
				for (Dependente d : listaDep) {
		%>
		<tr>
			<td><%=d.getCpfEmpregado()%></td>
			<td><%=d.getNome()%></td>
			<td><%=d.getGrauParentesco()%></td>
			<td><%=Util.formatarDataDeLocalDateParaGui(d.getDataNascimento())%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		break;
		}
	%>
</body>
</html>