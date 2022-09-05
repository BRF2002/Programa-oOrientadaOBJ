package Aula04;

public class Pessoa {
		String nome;
		float altura;
		float peso;
		int idade;
		
		public Pessoa(String nome, float altura, float peso, int idade) {
			super();
			this.nome = nome;
			this.altura = altura;
			this.peso = peso;
			this.idade = idade;
		}
		
		public Pessoa () {
			
		}
		
		public String Imprimir(Pessoa p1) {
			
			return "Nome: " + p1.getNome() + "\nAltura: " + p1.getAltura() + "\nPeso: " + p1.getPeso() +"\nIdade: " +  p1.getIdade();
		}
		
		public void aniversario() {
			this.idade = idade+1;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		

	}