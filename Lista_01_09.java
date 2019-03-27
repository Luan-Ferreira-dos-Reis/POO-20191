import java.util.Scanner;

public class Lista_01_09 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.println("inicio ->");
		int i = dado.nextInt();
		System.out.println("fim ->");
		int f = dado.nextInt();
		int q_par=0, q_impar=0, soma=0, atual;
		atual = i+1;
		while(atual<f){
			soma = soma + atual;
			if(atual%2 == 0){
				q_par++;
			}
			else{
				q_impar++;
			}
			atual++;
		}
		
		System.out.println("pares :" + q_par);
		System.out.println("impares :" + q_impar);
		System.out.println("soma :" + soma);
	    }

}
