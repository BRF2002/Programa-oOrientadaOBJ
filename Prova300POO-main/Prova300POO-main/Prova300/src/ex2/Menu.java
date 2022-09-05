package ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {

		    public static void menu(){
		
		        System.out.println("Digite o Número de sua opção!");
		        System.out.println("1- Cadastrar Utilitário");
		        System.out.println("2- Cadastrar Motocicleta");
		        System.out.println("3- Cadastrar Van");
		        System.out.println("4- Cadastrar Caminhão");
		        System.out.println("5- Sair");
		    }

		    public static void utilitario(){
		        System.out.println("Placa: TRE-1839 // Cor: Preta //  Modelo: ToyotaEt // Ano de fabricação: 2019 ");
		    }
		    
		    public static void motocicleta(){
		        System.out.println("Placa: JDE-9884 // Cor: Prata //  Modelo: Kawasaki // Ano de fabricação: 2020 ");
		    }
		    
		    public static void van(){
		        System.out.println("Placa: JDE-1839 // Cor: Branca //  Modelo: MercedesJW  // Ano de fabricação: 2021 ");
		    }
		    
		    public static void caminhao(){
		        System.out.println("Placa: TEE-7568 // Cor: Vermelho //  Modelo: Volvo // Ano de fabricação: 2021 ");
		        
		    }
		    public static void sair(){
		        System.out.println("Tchauu! ");
		    }
		    
		    public static void main(String[] args) {
		        int opcao;
		        Scanner entrada = new Scanner(System.in);
		        
		        do{
		            menu();
		            opcao = entrada.nextInt();
		            
		            switch(opcao){
		            case 1:
		                utilitario();
		                break;
		                
		            case 2:
		                motocicleta();
		                break;
		                
		            case 3:
		                van();
		                break;
		                
		            case 4:
		                caminhao();
		                break;
		            
		            default:
		                System.out.println("Opção inválida.");
		            }
		        } while(opcao != 0);
		    }
		}



