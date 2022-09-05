package Aula04;

public class Funcionario {


	String nome, dep, dataEnt, RG;
	double salario;
	boolean continua;
	
	
	
	public Funcionario(String nome, String dep, String dataEnt, String rG, double salario, boolean continua) {
		super();
		this.nome = nome;
		this.dep = dep;
		this.dataEnt = dataEnt;
		RG = rG;
		this.salario = salario;
		this.continua = continua;
	}
	
	
	  public Funcionario(String nome, String dep, double salario) {
			this.nome = nome;
			this.dep = dep;
			this.salario = salario;
			this.continua = true;
	
	  }
	  
	  public Funcionario(String nome, String RG) {
		  this.nome = nome;
		  this.RG = RG;
		  
	  }
	  public Funcionario() {
		  
	  }
	  
	 
	
	public void bonificar(float valor) {
		this.setSalario(this.getSalario()+valor);
	}
	
	public void demitir() {
		this.setContinua(false);
	}
	
	
	

	
	public String mostrarDados() {
		return "Funcionario [nome=" + nome + ", dep=" + dep + ", dataEnt=" + dataEnt + ", RG=" + RG + ", salario="
				+ salario + ", continua=" + continua + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getDataEnt() {
		return dataEnt;
	}
	public void setDataEnt(String dataEnt) {
		this.dataEnt = dataEnt;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isContinua() {
		return continua;
	}
	public void setContinua(boolean continua) {
		this.continua = continua;
	}
	
	
	
}
