package ex3;

public class NotasAluno {
	
	
	String nome, curso, periodo;
	int matricula;
	double notaAV1, notaAV2, notaAE;

	public NotasAlunos(String nome, String curso, String periodo, int matricula, double notaAV1, double notaAV2,double notaAE) 
	{
		super();
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}
	
	
	public void alteraNotaAV1(double notaAV1){
		this.notaAV1 = notaAV1;
	} 
	public void alteraNotaAV2(double notaAV2){
		this.notaAV2 = notaAV2;
	} 
	public void alteraNotaAE(double notaAE){
		this.notaAE = notaAE;
	} 
	public void avaliarAluno(double notaAV1, double notaAV2) {
		if(notaAV1+notaAV2>60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
	}
	
	
}
