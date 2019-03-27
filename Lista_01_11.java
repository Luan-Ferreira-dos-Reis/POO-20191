import java.util.Scanner;

public class Lista_01_11 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.print("código do produto :");
		int cod = dado.nextInt();
		double preco = 0;
		switch (cod){
	        case 10:
	            System.out.println("Pastel");
	            preco = 1.5;
	            break;
	        case 11:
	            System.out.println("Coxinha");
	            preco = 1.8;
	        case 12:
	        	System.out.println("Empada");
	        	preco = 1.9;
	            break;
	        case 20:
	        	System.out.println("Hamburger");
	        	preco = 10.0;
	            break;
	        case 30:
	        	System.out.println("Pizza");
	        	preco = 8.0;
	            break;
	        case 50:
	        	System.out.println("Suco");
	        	preco = 2.5;
	            break;
		}
        System.out.print("quantidade :");
        int quant = dado.nextInt();
		
        double valor_pago;
        valor_pago = preco * quant;
        
        if(valor_pago >= 50.0){
        	valor_pago = valor_pago*0.95;
        }
		System.out.println("valor pago: R$ " + valor_pago );
	    

	}
}
