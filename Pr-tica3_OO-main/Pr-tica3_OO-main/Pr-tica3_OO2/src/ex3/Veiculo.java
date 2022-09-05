package ex3;

public class Veiculo {

	private String placa;
	private int ano;
	private Veiculo automovel;
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Veiculo() {
		setAutomovel(new Veiculo("", 0));
	}
	public void exibirDados() {
		System.out.println("PLACA: " + placa + "/n Ano" + ano);
	}
	public Veiculo getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Veiculo automovel) {
		this.automovel = automovel;
	}
}

