package Aula04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Breno"); 
		p1.setAltura(1.79f);   
		p1.setIdade(19);
		
		Pessoa[] VetPessoa = new Pessoa[10];
		
		for(int i =0; i<VetPessoa.length; i++) {
			VetPessoa[i] = new Pessoa();
			VetPessoa[i].setNome("Teste");
			VetPessoa[i].setAltura(0);
			VetPessoa[i].setPeso(0);
			VetPessoa[i].setIdade(0);
			
		}
		
		
		  for(int i =0; i<VetPessoa.length; i++) { 
			  VetPessoa[i].aniversario();
			  VetPessoa[i].aniversario();	  
			  JOptionPane.showMessageDialog(null,VetPessoa[i].Imprimir(VetPessoa[i])); }
		 
		
		Funcionario f1 = new Funcionario(null, null, null, null, 0, false);
		Funcionario f2 = new Funcionario(null, null, null, null, 0, false);
		
		JOptionPane.showMessageDialog(null, "São iguais:" + (f1==f2));
		
		Funcionario[] funcionarios = null;
		Empresa e1 = new Empresa();
		
		e1.setVetFuncionario(funcionarios);
		

	}



}
