<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FormEmpregado</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style type="text/css">
.container {
	max-width: 460px;
}
</style>
</head>
<body class="bg-light">
	<div class="container">
		<div class="py-5 text-center">
			<h2>Form Empregado</h2>
			<p class="lead">Formulário para operações do Empregado no Banco
				de Dados</p>
		</div>
	</div>
	<div class="col-md-8 order-md-1">
		<h4 class="mb-3">Empregado</h4>

		<form name="formempregado" action="empregadoOp.jsp" method="post">

			<div class="row">
				<div class="col-md-6 mb-3">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" name="nome">
				</div>
				<div class="col-md-6 mb-3">
					<label for="cpf">Cpf</label> <input type="text"
						class="form-control" name="cpf">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 mb-3">
					<label for="idade">Idade</label> <input type="text"
						class="form-control" name="idade">
				</div>
				<div class="col-md-6 mb-3">
					<label for="salário">Salário</label> <input type="text"
						class="form-control" name="salario">
				</div>
			</div>

			<hr class="mb-4">
			<input id='inserir-submit' type='submit' name='submit'
				class="btn btn-success btn-md col-md-2" value='inserir'> <input
				id='alterar-submit' type='submit' name='submit'
				class="btn btn-warning btn-md col-md-2" value='alterar'> <input
				id='remover-submit' type='submit' name='submit'
				class="btn btn-danger btn-md col-md-2" value='remover'> <input
				id='pesquisar-submit' type='submit' name='submit'
				class="btn btn-primary btn-md col-md-2" value='pesquisar'> <input
				id='visualizar-submit' type='submit'
				class="btn btn-info btn-md col-md-2" name='submit'
				value='visualizar'>
		</form>
	</div>
</body>
</html>