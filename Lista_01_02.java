import java.util.Scanner;

public class Lista_01_02 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.println("ano de nascimento: ");
		int ano_nascimento = dado.nextInt();
		int idade = 2019 - ano_nascimento ;
		System.out.println(idade);
	    }

}
