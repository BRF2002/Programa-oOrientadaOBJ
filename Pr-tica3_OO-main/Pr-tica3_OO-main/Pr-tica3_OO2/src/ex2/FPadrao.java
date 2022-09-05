package ex2;

public class FPadrao extends Funcionario {

	
	public FPadrao(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}

	public double calcularProventos() {
		return getSalario();
	}

	public String toString() {
		return "Nome: "+ getNome() + " Salário: " + getSalario();
	}

	
}
