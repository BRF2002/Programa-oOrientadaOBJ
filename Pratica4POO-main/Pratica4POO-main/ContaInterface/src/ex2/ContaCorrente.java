package ex2;

public class ContaCorrente implements Conta{

private double saldo;
private double taxaOperacao;
	


public void depositar (double valor) {
this.saldo += valor - taxaOperacao;
}

public double getSaldo() {
return this.saldo;
}

public void sacar (double valor) {
this.saldo -= valor + taxaOperacao;
}
}
