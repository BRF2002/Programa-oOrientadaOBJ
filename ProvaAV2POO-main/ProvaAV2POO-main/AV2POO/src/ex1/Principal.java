package ex1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			String dataCriacao,nomeUsuario,dataNascimento,senha, dataPublicacao, textoPublicacao, linkMidia;
			
			System.out.println("Digite a data da criação: ");
			dataCriacao=ler.next();
			System.out.println("Digite o usuário: ");
			nomeUsuario=ler.next();
			System.out.println("Digite a sua data de nascimento: ");
			dataNascimento=ler.next();
			System.out.println("Senha: ");
			senha=ler.next();
			
			System.out.println("Digite a data da publicação: ");
			dataPublicacao=ler.next();
			System.out.println("Digite o texto que deseja publicar: ");
			textoPublicacao=ler.next();
			System.out.println("Link: ");
			linkMidia=ler.next();
			
			
			RedeSocial rs1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
			Publicacao rs = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		}

	}

	

