package ex2;

public class Empresa {
		
	public static void main(String[]args) {
		FPadrao f1 = new FPadrao(123, "Breno", 1000);
		System.out.println(f1.toString());
		
		FComissionado f2 = new FComissionado(13, "Joana", 1000,500,10);
		System.out.println(f2.toString());
	}
}
