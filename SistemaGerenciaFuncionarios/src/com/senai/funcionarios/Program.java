package com.senai.funcionarios;


import com.senai.funcionarios.model.*;
import com.senai.funcionarios.model.Gerente;
import com.senai.funcionarios.model.service.Empresa;

public class Program {

	public static void main(String[] args) {
		Empresa es = new Empresa("AWS");
		Gerente f = new Gerente("Gabriel", 3000.0, "BARRIL");
		es.adicionarFuncionario(f);
		System.out.println(es.exibirFuncionarios());
		f.autenticar("Birril");
		
	}

}
