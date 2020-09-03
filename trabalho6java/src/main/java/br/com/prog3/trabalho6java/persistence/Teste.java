package br.com.prog3.trabalho6java.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.trabalho6java.controller.AlunoController;
import br.com.prog3.trabalho6java.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		/*AlunoController ad = new AlunoController();
		ad.setMatricula(2);
		ad.findAluno();
		Aluno aluno = ad.getAluno();
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}
*/
	}

}
