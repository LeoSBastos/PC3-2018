package br.com.prog3.rh.view;


//import java.sql.Connection;
//import br.com.prog3.rh.persistencia.ConnectionFactory;
import br.com.prog3.rh.controller.EmpregadoController;
import br.com.prog3.rh.negocio.Empregado;


public class Teste {
	public static void main(String[] args) {
//		Connection con = ConnectionFactory.getConnection();
//		if(con != null){
//			System.out.println("Connected");
//		}
		Empregado e = new Empregado();
		
		e.setCpf("10");
		e.setNome("Leo");
		e.setIdade(20);
		e.setSalario(30.0);
		EmpregadoController ec = new EmpregadoController();
		System.out.println(ec.inserir(e));
	}
}
