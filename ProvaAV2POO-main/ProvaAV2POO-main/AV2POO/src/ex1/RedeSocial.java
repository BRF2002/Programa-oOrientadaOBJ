package ex1;
import java.util.ArrayList;

public class RedeSocial {


public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		// TODO Auto-generated constructor stub
	}

public class redeSocial {
	private String dataCriacao, nomeUsuario, dataNascimento, senha;
	
	ArrayList<Publicacao> publicacoes = new ArrayList<> (); 
	
	public redeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	public void RedeSocial(String dataCriacao,String nomeUsuario,String dataNascimento, String senha) {
		
	}
	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}
	public void imprimePublicacao() {
		
	}
}
}
	
	