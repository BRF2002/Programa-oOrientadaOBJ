package ex1;

public class Camarote extends Ingresso {

	private String localizacao;
	private double valorAdicional;
	public Camarote(double valor, String localizacao, double valorAdicional) {
		super(valor);
		this.localizacao = localizacao;
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeCamarote () {
		
		double valorCamarote = valorAdicional + getValor();
		
		System.out.println("===Ingresso Camarote===");
		System.out.println("Valor ingresso com adiconal: " + valorCamarote);
		System.out.println("Camarote localizado em: " + localizacao);
		
	}
}
