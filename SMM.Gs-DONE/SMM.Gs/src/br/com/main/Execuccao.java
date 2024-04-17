package br.com.main;
import javax.swing.JOptionPane;

import br.com.beans.ParametrosSmart;
import br.com.beans.Usuario;
import br.com.beans.localizacao;
import br.com.beans.pessoaconfinaca;

public class Execuccao {
	
	//String
		static String texto(String j) {return JOptionPane.showInputDialog(j);
			
		}
		// int
		static int inteiro(String j) 
		{return Integer.parseInt(JOptionPane.showInputDialog(j)); } 
		//double
		static double real (String j)
		{return Double.parseDouble(JOptionPane.showInputDialog(j)); } 
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	//instanciar objetos
	Usuario objUsuario = new Usuario(
			texto("Digite o nome do usuario"),
			inteiro("Digite sua idade"),
			texto("Digite seu genero"),
			real("Digite seu cpf"),
			real("Digite seu numero de cadastro"),
			texto("Digite sua nacionalidade"),
			inteiro("Digite seu peso"),
			real("Digite sua altura"));
	
	objUsuario.faixaetaria(objUsuario.getIdade());
	

	
	localizacao objLocalizacao = new localizacao(texto("Digite o longradouro"),texto(" Digite o Bairro"),texto(" digite o numero"),texto("digite o municipio"),
			texto("digite a cidade"),texto("Digite o pais"),texto("Digite o cep"));
	
	
	ParametrosSmart objParametrossmart = new ParametrosSmart (real("Digite a pressão arterial:"),
			inteiro("Digite os BPM:"),inteiro("Digite a taxa de injestão de liquiodos:"),real("percentual de O2"));
	
	
	pessoaconfinaca objPessoaconfinaca = new pessoaconfinaca(texto("Nome da pessoa de confiança"),real("Telefone pessoa de confiança"),
			texto("Grau de parentesco"));
	
	//saida.
	System.out.println("Nome do usuário: " + objUsuario.getNome() +
		    "\nIdade: " + objUsuario.getIdade() + 
		    "\nGenero: " + objUsuario.getGenero() +
		    "\nNumero de cadastro: " + objUsuario.getNumeroCadastro() +
		    "\nNacionalidade: " + objUsuario.getNacionalidade() + 
		    "\nPeso: " + objUsuario.getPeso() + 
		    "\nLongradouro: " + objLocalizacao.getLongradouro() +
		    "\nBairro: " + objLocalizacao.getBairro() +
		    "\nNumero: " + objLocalizacao.getNumero() +
		    "\nMunicipio: " + objLocalizacao.getMunicipio() + 
		    "\nCidade: " + objLocalizacao.getCidade() + "\nPais: " + objLocalizacao.getPaís()+ 
		     "\nCep: " + objLocalizacao.getCep() +
		    "\nPARAMETROS DE SAUDE" +
		    "\nPressão arterial: " + objParametrossmart.getPressaoarterial() +
		    "\nBatimentos por minuto(BPM): " + objParametrossmart.getBPM() + 
		    "\nTaxa de oxigenio: " + objParametrossmart.getPercentualO2() +
		    "\nIngestão de líquidos: " + objParametrossmart.getTaxainjestaoliquidos() +
		    "\nPESSOA DE CONFIANÇA" + "\nNome da pessoa de confiança: " +
		    objPessoaconfinaca.getNome() +
		    "\nTelefone: " + objPessoaconfinaca.getTelefone() + "\nGrau de parentesco: " + objPessoaconfinaca.getGrauparentesco()+
		   "\nFaixa etária: "+ objUsuario.faixaetaria(objUsuario.getIdade())+
		   "\nIMC:"+ objUsuario.IMC(objUsuario.getPeso(), objUsuario.getAltura()) +
		   "\nAlerta saturação de O2:"+objParametrossmart.calcularNivelO2(objParametrossmart.getPercentualO2()));  
	}
}



			
	
	

	
	
	
	
	

