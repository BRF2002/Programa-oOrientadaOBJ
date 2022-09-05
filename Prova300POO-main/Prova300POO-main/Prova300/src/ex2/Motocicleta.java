package ex2;

public class Motocicleta extends VeiculodePasseio{

	public Motocicleta(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
	}
	
	String Potencia, Tipo;

	public Motocicleta(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas, String potencia, String tipo) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
		Potencia = potencia;
		Tipo = tipo;
	}

	public String getPotencia() {
		return Potencia;
	}

	public void setPotencia(String potencia) {
		Potencia = potencia;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

}
