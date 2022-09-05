package ex2;

public class Rendimento {
	Scanner entrada = new Scanner(System.in);

	int inicialInvestimento;
	float taxa;
	int nMeses;
	
	public Rendimento(int inicialInvestimento, float taxa, int numMeses) {
		this.inicialInvestimento = inicialInvestimento;
		this.taxa = taxa;
		this.nMeses = numMeses;
}

	public int getInicialInvest() {
		return inicialInvestimento;
	}

	public void setinicialInvestimento(int inicialInvestimento) {
		this.inicialInvestimento = inicialInvestimento;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public int getNumMeses() {
		return nMeses;
	}

	public void setNumMeses(int nMeses) {
		this.nMeses = nMeses;
	}


	public float showInvest() {
		
		float finalInvestimento = this.inicialInvestimento;
		for (int i = 0; i < this.nMeses; i++) {
			finalInvestimento = finalInvestimento + (finalInvestimento * this.taxa);
		}
		
		return finalInvestimento;
		
		
	}

}

