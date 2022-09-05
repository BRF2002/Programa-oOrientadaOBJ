package ex3;

public class Vendedores extends Funcionario{
		
		private double comissao;
		private int totalVendas;
		private double totalValor;
		
		public void novaVenda(double valor, int qtdVenda) {
			this.setTotalVendas(this.getTotalVendas() + qtdVenda);
			this.totalValor += valor;
		}
		
		public double salarioTotal() {
			double salario = getSalarioBase() + (totalValor * 0.05);
			setTotalVendas(0);
			totalValor=0;
			return salario;
		}

		public double getComissao() {
			return comissao;
		}

		public void setComissao(double comissao) {
			this.comissao = comissao;
		}

		public int getTotalVendas() {
			return totalVendas;
		}

		public void setTotalVendas(int totalVendas) {
			this.totalVendas = totalVendas;
		}
		
	}
