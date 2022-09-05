package ex1;

public class EstoqueMain {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			String nome; 
			int qtdAtual, qtdMinima, darBaixa;
			
			System.out.println("Insira o nome");
			nome = ler.nextLine();
			
			System.out.println("Insira a quantidade atual");
			qtdAtual = ler.nextInt();
			
			System.out.println("Insira a quantidade minima");
			qtdMinima = ler.nextInt();
			
			System.out.println("Insira a quantidade itens para dar baixa");
			darBaixa = ler.nextInt();
			
			Estoque e1= new Estoque(nome, qtdAtual, qtdMinima);
			
			e1.darBaixa(darBaixa);
			
			System.out.println(e1.mostra());
		
			e1.precisaRepor();
			
			
		}

	}
