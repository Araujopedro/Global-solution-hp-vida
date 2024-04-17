package br.com.beans;

public class localizacao {
	
	private String longradouro;
	private String bairro;
	private String numero;
	private String municipio;
	private String cidade;
	private String País;
	private String cep;
	
	
	
	public localizacao() {
		super();
	}



	public localizacao(String longradouro, String bairro, String numero, String municipio, String cidade, String país,
			String cep) {
		super();
		this.longradouro = longradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.municipio = municipio;
		this.cidade = cidade;
		País = país;
		this.cep = cep;
	}



	public String getLongradouro() {
		return longradouro;
	}



	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getPaís() {
		return País;
	}



	public void setPaís(String país) {
		País = país;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	


	

}
