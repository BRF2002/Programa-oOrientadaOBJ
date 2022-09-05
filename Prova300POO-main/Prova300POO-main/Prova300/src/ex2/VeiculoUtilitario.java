package ex2;

public class VeiculoUtilitario extends VeiculodePasseio{

	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
	}
	String Tracao, Tipo, NmrdePortas, ListaOpcionais;
	
	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, String anoDeFab, String diaria,
			String nmrPortas, String tracao, String tipo, String nmrdePortas, String listaOpcionais) {
		super(placa, cor, modelo, fabricante, anoDeFab, diaria, nmrPortas);
		Tracao = tracao;
		Tipo = tipo;
		NmrdePortas = nmrdePortas;
		ListaOpcionais = listaOpcionais;
	}

	public String getTracao() {
		return Tracao;
	}

	public void setTracao(String tracao) {
		Tracao = tracao;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNmrdePortas() {
		return NmrdePortas;
	}

	public void setNmrdePortas(String nmrdePortas) {
		NmrdePortas = nmrdePortas;
	}

	public String getListaOpcionais() {
		return ListaOpcionais;
	}

	public void setListaOpcionais(String listaOpcionais) {
		ListaOpcionais = listaOpcionais;
	}
	
}
