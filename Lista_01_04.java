import java.util.Scanner;

public class Lista_01_04 {
	public static void main(String[] args) {
		double notas[] = new double[4];
		double soma = 0;
		double m�dia = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("notas :");
		
		for (int i=0; i<4; i++) {
			notas[i] = ler.nextDouble(); 
			soma = soma+notas[i];
		}
		
		m�dia = soma/4;
		
		if(m�dia >= 7) {
			System.out.println("Aprovado!");
		}
		if(m�dia < 5) {
			System.out.println("Reprovado!");
		}
		if(m�dia >=5 && m�dia < 7 ){
			System.out.println("Final!");
			
		}
		
		
		
	}

}
