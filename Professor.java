import java.util.ArrayList;

public class Professor {
	private String nome;
	private int matricula;
	private String grau;
	private double salario;
	
	public Professor(String i_nome, int i_matricula, String i_grau, double i_salario){
		this.nome = i_nome;
		this.matricula = i_matricula;
		this.grau = i_grau;
		this.salario = i_salario;	
	}
	
	String get_nome(){
		return this.nome;
	}
	
	int get_matricula(){
		return this.matricula;
	}
	
	String get_grau(){
		return this.grau;
	}
	
	double get_salario(){
		return this.salario;
	}
}
