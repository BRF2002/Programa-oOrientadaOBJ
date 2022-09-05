package ex2;

import java.util.ArrayList;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id_aluno,id_prova,ano,nota, notaTotal = 0; 
		String nome, titulo; 

		 ArrayList<ProvaEnem> provas = new ArrayList<> (); 
		System.out.println("Digite o ID: ");
		id_aluno=ler.nextInt();
		System.out.println("Digite o nome: ");
		nome=ler.next();
		System.out.println("Digite o ano: ");
		ano=ler.nextInt();
			 
		 AlunoEnem a1 = new AlunoEnem(id_aluno, nome, ano);
		 
		 for(int i=0;i<=5;i++) {
			System.out.println("Digite o ID da Prova: ");
			id_prova=ler.nextInt();
			System.out.println("Digite o titulo da avaliação: ");
			titulo=ler.next();
			System.out.println("Digite a nota obtida: ");
			nota=ler.nextInt();
			
			ProvaEnem prova1 = new ProvaEnem (id_prova, titulo, nota);
			provas.add(prova1);
			
			notaTotal+=prova1.getNota();
			
		 }
		 System.out.println("A nota total do aluno "+nome+" é: "+notaTotal);
	}

}
