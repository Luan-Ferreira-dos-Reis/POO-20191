import java.util.Scanner;

public class Lista_01_08 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int n[] = new int[10];
		int menor=0, maior=0;
		double m�dia=0;
		
		System.out.println("digite os n�meros: ");
		for(int i=0; i<10; i++){
			n[i] = dado.nextInt();
			m�dia = m�dia + n[i];
		}
		
		m�dia = m�dia/10;
		menor = n[0];
		maior = n[0];
		
		for(int i=0; i<10; i++){
			if(n[i] < menor){
				menor = n[i];
			}
			if(n[i] > maior){
				maior = n[i];
			}
		}
		
		
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("m�dia: " + m�dia);
	    }
}
