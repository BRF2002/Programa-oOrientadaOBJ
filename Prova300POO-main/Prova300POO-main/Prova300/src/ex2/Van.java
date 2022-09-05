package ex2;

public class Van extends VeiculodePasseio {

	public Van(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
	}

	String NmrdePass, NmrdeEixos;

	public Van(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas, String nmrdePass, String nmrdeEixos) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
		NmrdePass = nmrdePass;
		NmrdeEixos = nmrdeEixos;
	}

	public String getNmrdePass() {
		return NmrdePass;
	}

	public void setNmrdePass(String nmrdePass) {
		NmrdePass = nmrdePass;
	}

	public String getNmrdeEixos() {
		return NmrdeEixos;
	}

	public void setNmrdeEixos(String nmrdeEixos) {
		NmrdeEixos = nmrdeEixos;
	}
	
}
