package ex2;

public class Caminhao extends VeiculodePasseio {

	public Caminhao(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
	}
	
	String CapadeCarga, NmrdeEixos;

	public Caminhao(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas, String capadeCarga, String nmrdeEixos) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
		CapadeCarga = capadeCarga;
		NmrdeEixos = nmrdeEixos;
	}

	public String getCapadeCarga() {
		return CapadeCarga;
	}

	public void setCapadeCarga(String capadeCarga) {
		CapadeCarga = capadeCarga;
	}

	public String getNmrdeEixos() {
		return NmrdeEixos;
	}

	public void setNmrdeEixos(String nmrdeEixos) {
		NmrdeEixos = nmrdeEixos;
	}
	
	
}
