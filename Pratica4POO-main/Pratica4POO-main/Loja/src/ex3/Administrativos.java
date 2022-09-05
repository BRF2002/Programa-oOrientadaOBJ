package ex3;

public class Administrativos extends Funcionario {

	private double horasExtra;
	
	public double salarioTotal() {
		double salario = getSalarioBase() + ( horasExtra * (this.getSalarioBase()/100));
		horasExtra=0;
		return salario;
	}

}
