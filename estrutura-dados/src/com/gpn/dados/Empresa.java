package com.gpn.dados;

public class Empresa {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public Empresa(String nomeFantasia, String razaoSocial, String cnpj) {
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
}