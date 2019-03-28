import java.util.ArrayList;

public class Turma {
	private String nome;
	private int codigo;
	private String sala;
	private int horario;
	private char tipo;
	private Professor prof;
	private ArrayList<Aluno> estudantes = new ArrayList();
	private ArrayList<ArrayList> notas = new ArrayList();
	private ArrayList<String> materiais = new ArrayList();
	
	
	public Turma(String i_nome, int i_codigo, String i_sala, int i_horario, char i_tipo){
		this.nome = i_nome;
		this.codigo = i_codigo;
		this.sala = i_sala;
		this.horario = i_horario;
		this.tipo = i_tipo;
	}
	
	public void cadastro_professor(Professor i_professor){
		this.prof = i_professor;
	}
	
	public void cadastro_aluno(Aluno i_aluno){
		this.estudantes.add(i_aluno);	
	}
	
	public String boletim(int i_matricula){
		String info="aluno não encontrado";
		int n_alunos = this.estudantes.size();
		for (int i=0; i<n_alunos; i++){
			if(this.estudantes.get(i).get_matricula() == i_matricula){
				info = this.estudantes.get(i).get_nome()+ " Notas: " ;
				//for (int j=0 ; i<notas.get(i).size(); i++ ) {
				//	info = info + " " +this.notas.get(i).get(j);
				//}
				
			}
		}
		return info;	
	}
	
	public void add_nota(int i_matricula, int i_nota){
		int x=2;
		int n_alunos = this.estudantes.size();
		for (int i=0; i<n_alunos; i++){
			if(this.estudantes.get(i).get_matricula() == i_matricula){
				this.notas.get(i).add(i_nota);
			}
		}
	}
	
	public void add_materiais(String i_material){
		this.materiais.add(i_material);
	}
}
