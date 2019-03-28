import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private String data_nasc;
	private String mae;
	
	public Aluno(String i_nome, int i_matricula, String i_data_nasc, String i_mae){
		this.nome = i_nome;
		this.matricula = i_matricula;
		this.data_nasc = i_data_nasc;
		this.mae = i_mae;
	}
	
	String get_nome(){
		return this.nome;
	}
	
	int get_matricula(){
		return this.matricula;
	}
	
	String get_data_nasc(){
		return this.data_nasc;
	}
	
	String get_mae(){
		return this.mae;
	}
	
	String get_boleto(){
		String boleto = "Escola ZYW " + this.get_matricula() + " Responsável: " +  this.get_mae()+ " |valor a pagar R$ 250,00| ";
		return boleto;
	}
}
