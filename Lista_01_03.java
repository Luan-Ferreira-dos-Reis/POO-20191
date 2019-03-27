import java.util.Scanner;

public class Lista_01_03 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.println("notas: ");
		int notas[] = new int [3];
		
		for(int i=0; i<3; i++){
			notas[i] = dado.nextInt();
		}
		
		double média = (notas[0]*2+notas[1]*3+notas[2]*5)/10;
		
		System.out.println(média);
	    }

}
