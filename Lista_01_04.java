import java.util.Scanner;

public class Lista_01_04 {
	public static void main(String[] args) {
		double notas[] = new double[4];
		double soma = 0;
		double média = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("notas :");
		
		for (int i=0; i<4; i++) {
			notas[i] = ler.nextDouble(); 
			soma = soma+notas[i];
		}
		
		média = soma/4;
		
		if(média >= 7) {
			System.out.println("Aprovado!");
		}
		if(média < 5) {
			System.out.println("Reprovado!");
		}
		if(média >=5 && média < 7 ){
			System.out.println("Final!");
			
		}
		
		
		
	}

}
