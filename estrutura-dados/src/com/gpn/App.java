package com.gpn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gpn.dados.Empresa;

public class App {
	public static void main(String[] args) {
		// Criando objetos, iguais!
		Empresa ep1 = new Empresa("Mercado Online", "ABC-LTDA", "999.999.999-99");
		Empresa ep2 = new Empresa("Mercado Online", "ABC-LTDA", "999.999.999-99");

		// Criando uma lista de empresas
		List<Empresa> listaEmpresas = new ArrayList<>();

		// Inserindo elementos iguais na lista
		listaEmpresas.add(ep1);
		listaEmpresas.add(ep2);

		// Verificando que a lista permite a inserção de elementos iguais!
		for (Empresa empresa : listaEmpresas) {
			System.out.println(empresa.getCnpj());
		}

		// Criando um conjunto de empresas
		Set<Empresa> conjuntoEmpresas = new HashSet<>();

		// Inserindo elementos iguais no conjunto
		conjuntoEmpresas.add(ep1);
		conjuntoEmpresas.add(ep2);

		// Verificando que um conjunto não permite objetos considerados iguais!
		for (Empresa empresa : conjuntoEmpresas) {
			System.out.println(empresa.getCnpj());
		}
	}
}