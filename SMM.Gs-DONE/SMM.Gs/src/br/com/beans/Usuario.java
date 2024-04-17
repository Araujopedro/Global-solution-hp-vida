package br.com.beans;


public class Usuario {
	
	private String nome;
	private int idade;
	private String genero;
	private double cpf;
	private double numeroCadastro;
	private String nacionalidade;
	private int peso;
	private double altura;
	//atributos de refencia.
	private localizacao Localizaçao;
	private ParametrosSmart parametrosmart;
	private pessoaconfinaca pessoaconfiança;
		
	public Usuario() {
		super();
	}

	public Usuario(String nome, int idade, String genero, double cpf, double numeroCadastro,
			String nacionalidade, int peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.cpf = cpf;
		this.numeroCadastro = numeroCadastro;
		this.nacionalidade = nacionalidade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}


	public double getNumeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(double numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public localizacao getLocalizaçao() {
		return Localizaçao;
	}

	public void setLocalizaçao(localizacao localizaçao) {
		Localizaçao = localizaçao;
	}

	public ParametrosSmart getParametrosSmart() {
		return parametrosmart;
	}

	public void setParametrosmart(ParametrosSmart parametrosmart) {
		this.parametrosmart = parametrosmart;
	}

	public pessoaconfinaca getPessoaconfiança() {
		return pessoaconfiança;
	}

	public void setPessoaconfiança(pessoaconfinaca pessoaconfiança) {
		this.pessoaconfiança = pessoaconfiança;
	}
	
	//Métodos 
	
	
	//método para calcular imc
	public double IMC(int peso , double altura) {
	   double imc = peso/Math.pow(altura, 2);

	   return imc;
		
	}
	
	//Método para calcular a faixa etaria
	public String faixaetaria(int idade) {
		if(idade>=18) {
			return "Voce é maior de idade";
		} else  {
			return "Voce é menor de idade";
		}
	}
		
	
	

}

	