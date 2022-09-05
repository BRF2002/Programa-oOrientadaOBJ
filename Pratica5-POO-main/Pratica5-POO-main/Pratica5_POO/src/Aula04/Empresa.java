package Aula04;

public class Empresa {

	String nome, cnpj;
	int qtdeFuncionario = 0;
	int tamanho;
	Funcionario[] VetFuncionario;
	
	
	public Empresa(String nome, String cnpj,int tamanho ) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.tamanho =tamanho;
		
	}
	
	public Empresa() {
		this.tamanho = 100;
	}


	public Empresa(Funcionario[] vetFuncionario) {
		super();
		VetFuncionario = vetFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}

	public void setQtdeFuncionario(int qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Funcionario[] getVetFuncionario() {
		return VetFuncionario;
	}

	public void setVetFuncionario(Funcionario[] vetFuncionario) {
		VetFuncionario = vetFuncionario;
	}


	
	
	
	

}
