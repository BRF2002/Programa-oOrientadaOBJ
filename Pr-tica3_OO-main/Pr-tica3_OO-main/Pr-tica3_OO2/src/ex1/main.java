package ex1;

import java.util.Scanner;

public class main {

	public main(String[] args) {
		
		int menu;
		double val = 222;
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Selecione uma das opções abaixo:");
			System.out.println("(1) Ingresso Normal");
			System.out.println("(2) VIP");
			System.out.println("(3) Camarote");
			menu = ler.nextInt();
		}
		
		switch (menu) {
		case 1:
			Normal normal = new Normal(val);
			normal.Normal();
			break;
		
		case 2:
			VIP vip = new VIP(val,200);
			vip.imprimeVip();
			break;
			
		case 3:
			Camarote camarote = new Camarote(111,"Arquibancada",300);
			camarote.imprimeCamarote();
			break;		
			
		default:
			System.out.println("Opção inválida :(");
		
		}
	}
}
