package com.gpn.comparadores;

import java.util.Comparator;

import com.gpn.dados.Empresa;

public class ComparadorEmpresa implements Comparator<Empresa> {
	@Override
	public int compare(Empresa obj1, Empresa obj2) {
		String identificacaoObj1 = obj1.getCnpj() + obj1.getRazaoSocial();
		String identificacaoObj2 = obj2.getCnpj() + obj2.getRazaoSocial();
		return identificacaoObj1.compareTo(identificacaoObj2);
	}
}
