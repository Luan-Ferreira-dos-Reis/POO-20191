import java.util.Scanner;

public class Lista_01_10 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.print("digite n�mero :");
		double n = dado.nextDouble();
		int count=0;
		while(n/2>=1){
			n=n/2;
			count++;
		}
		
		System.out.println("divis�es :" + count);
		System.out.println("ultimo resutado :" + n);
	}
		

}
