import java.util.Scanner;

public class Lista_01_05 {
	public static void imp_mes(int m){
		switch (m){
	        case 1:
	            System.out.println("Janeiro");
	            break;
	        case 2:
	            System.out.println("Fevereiro");
	        case 3:
	        	System.out.println("Mar�o");
	            break;
	        case 4:
	        	System.out.println("Abril");
	            break;
	        case 5:
	        	System.out.println("Maio");
	            break;
	        case 6:
	        	System.out.println("Junho");
	            break;
	        case 7:
	            System.out.println("Julho");
	            break;
	        case 8:
	            System.out.println("Agosto");
	        case 9:
	        	System.out.println("Setembro");
	            break;
	        case 10:
	        	System.out.println("Outubro");
	            break;
	        case 11:
	        	System.out.println("Novembro");
	            break;
	        case 12:
	        	System.out.println("Dezembro");
	            break;
		}
	}
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.println("n�mero: ");
		int m�s = dado.nextInt();
		imp_mes(m�s);
	    }

}
