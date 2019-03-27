import java.util.Scanner;

public class Lista_01_06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("nome: ");
		String nome = ler.nextLine();
		System.out.print("diárias: ");
		double n = ler.nextDouble();
		double taxa;
		if(n > 15){
			taxa = 5.50*n;
		}
		if(n == 15){
			taxa = 6.00*n;
		}
		else{
			taxa = 8.00*n;
		}
		
		double total = 60*15.00+taxa;
		System.out.println("Cliente " + nome);
		System.out.println("conta R$ " + total);
	    }

}
