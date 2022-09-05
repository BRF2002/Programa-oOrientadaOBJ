package ex2;

public class ContaPoupanca {

	private double saldo;
	
	public void depositar (double valor) {
		this.saldo += saldo;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

}