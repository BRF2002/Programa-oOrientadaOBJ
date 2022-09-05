package ex1;

public class Aluno extends Pessoa {

	public Aluno (float altura, float peso) {
		super(altura, peso);
}
	
	int Matricula;

	public Aluno(float altura, float peso, int matricula) {
		super(altura, peso);
		Matricula = matricula;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	
	
}
