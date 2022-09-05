package ex2;

public class EmpregadoFaculdade {
	
		private String nome;
		private double salario;
		private int horasAula;
		private double salarioUpdated;
		
		
		public EmpregadoFaculdade(String nome, double salario, int horasAula) {
			super();
			this.nome = nome;
			this.salario = salario;
			this.horasAula = horasAula;

		}

		double getGastos() {
			//return this.salario + (this.horasAula*40);
			return this.salarioUpdated = (this.salario+this.horasAula*40);
		}
		
		String getInfo() {
			return "nome: " + this.nome + " com salário " + this.salarioUpdated;
		}
		


