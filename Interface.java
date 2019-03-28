import java.util.Scanner;
import java.util.ArrayList;

public class Interface {
	public static void main(String[] args) {
		
		
		Scanner dado = new Scanner(System.in);
		System.out.println("Escola ZYW");
		
		Turma t1 = new Turma("Matematica", 1001, "CAA202", 14, 'A');
		Professor p1 = new Professor("Severino", 1001 , "Mestre", 5000.00);
		Aluno a1 = new Aluno("João", 40001 , "13/06/2010", "Mariana");
		Aluno a2 = new Aluno("Maria", 40002 , "09/05/2009", "Elena");
		Aluno a3 = new Aluno("Vanessa", 40003 , "10/03/2015", "Patrícia");
		Aluno a4 = new Aluno("Alberto", 40003 , "15/09/2012", "Marlene");
		
		t1.cadastro_professor(p1);
		t1.cadastro_aluno(a1);
		t1.cadastro_aluno(a2);
		t1.cadastro_aluno(a3);
		t1.cadastro_aluno(a4);
		
		t1.add_nota(40001, 45);
		
		
		
		
		
		System.out.println(a2.get_boleto());
	    }

}
