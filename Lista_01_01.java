import java.util.Scanner; 

public class Lista_01_01 {
	public static void main(String[] args) {
	Scanner dado = new Scanner(System.in);
	System.out.print("v(m/s) :");
	double v = dado.nextDouble();
	v = v*3.6;
	System.out.println("v(Km/h) :" + v);
    }
	
	
}
