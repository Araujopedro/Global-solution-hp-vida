package br.com.beans;

public class pessoaconfinaca {
	private String nome;
	private  double telefone;
	private String grauparentesco;
	
	public pessoaconfinaca() {
		super();
	}
	
	public pessoaconfinaca(String nome, double telefone, String grauparentesco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.grauparentesco = grauparentesco;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public String getGrauparentesco() {
		return grauparentesco;
	}
	public void setGrauparentesco(String grauparentesco) {
		this.grauparentesco = grauparentesco;
	}
	
	
	
	

}
