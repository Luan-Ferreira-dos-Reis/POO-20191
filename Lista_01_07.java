import java.util.Scanner;

public class Lista_01_07 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.print("nota :");
		int nota = dado.nextInt();
		if(nota < 49){
			System.out.println("Insuficiente");
		}
		if(nota < 64 && nota>49){
			System.out.println("Regular");
		}
		if(nota > 64 && nota < 85){
			System.out.println("Bom");
		}
		if(nota > 84 && nota < 100){
			System.out.println("Ótimo");
		}
	}

}
