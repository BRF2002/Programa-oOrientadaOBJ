package ex1;
import java.util.Scanner;
public abstract class Pessoa {

	float altura, peso;

	public Pessoa(float altura, float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}
	
	public Pessoa() {
		super();
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
	
	    public static void Andar(){
	        System.out.println(" Você é uma pessoa capaz de andar ");
	}
	
	    public static void Correr(){
	        System.out.println(" Você é uma pessoa capaz de correr ");
	}
}
