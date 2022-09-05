package ex1;

public class Estoque {

		private String nome;
		private int qtdeAtual, qtdMinima;
		
		
		public Estoque(String nome, int qtdeAtual, int qtdMinima) {
			
			this.nome = nome;
			this.qtdeAtual = qtdeAtual;
			this.qtdMinima = qtdMinima;
		}
		
		public Estoque() {
			
		}
		
		public void darBaixa(int qtde) {
			if(this.qtdeAtual - qtde >=0) {
				this.qtdeAtual += qtde;
			}else System.out.println("ESTOQUE NÃO PODE FICAR NEGATIVO");
			
			
		}
		
		public String mostra () {
			return "Nome do produto: " + this.nome + "qtde mínima:" + this.qtdMinima ;
		}
		
		public boolean presisaRepor() {
			
			if(this.qtdeAtual<= this.qtdMinima) {
				return true;
			}else return false;
		}
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getQtdeAtual() {
			return qtdeAtual;
		}


		public void setQtdeAtual(int qtdeAtual) {
			this.qtdeAtual = qtdeAtual;
		}


		public int getQtdMinima() {
			return qtdMinima;
		}


		public void setQtdMinima(int qtdMinima) {
			this.qtdMinima = qtdMinima;
		}

		
		
		
	}
