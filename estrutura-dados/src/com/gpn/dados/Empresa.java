package com.gpn.dados;

import java.util.Comparator;
import java.util.Objects;

import com.gpn.comparadores.ComparadorEmpresa;

public class Empresa {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public Empresa(String nomeFantasia, String razaoSocial, String cnpj) {
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		if (cnpj != null && razaoSocial != null) {
			if (cnpj.isBlank() || razaoSocial.isBlank()) {
				return super.hashCode();
			} else {
				String identificacao = this.cnpj + this.razaoSocial;
				return Objects.hash(identificacao);
			}
		}
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa empresa = (Empresa) obj;
		if (this.cnpj == null || empresa.getCnpj() == null)
			return false;
		if (this.cnpj.isBlank() || empresa.getCnpj().isBlank())
			return false;
		if (this.razaoSocial == null || empresa.getRazaoSocial() == null)
			return false;
		if (this.razaoSocial.isBlank() || empresa.getRazaoSocial().isBlank())
			return false;
		Comparator<Empresa> comparador = new ComparadorEmpresa();
		int comparacao = comparador.compare(this, empresa);
		return (comparacao == 0 ? true : false);
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