package ex1;

public class VIP extends Ingresso {

	public VIP(double valor) {
		super(valor);
	}

	private double valorAdicional;

	public VIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeVip () {
		
		double valorVip = valorAdicional + getValor();
		
		System.out.println("===Ingresso VIP===");
		System.out.println("Valor ingresso com adiconal: " + valorVip);
		
	}
	
	
}
