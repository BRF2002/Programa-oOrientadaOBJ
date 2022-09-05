package ex1;

public class Publicacao{

	public static double contadorPublicacao;
	
	
	private String dataPublicacao;
	private String textoPublicacao;
	private String linkMidia;

	
	public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.textoPublicacao = textoPublicacao;
		this.linkMidia = linkMidia;
	}
	
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public String getTextoPublicacao() {
		return textoPublicacao;
	}
	public void setTextoPublicacao(String textoPublicacao) {
		this.textoPublicacao = textoPublicacao;
	}
	public String getLinkMidia() {
		return linkMidia;
	}
	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}
	public static double getContadorPublicacao() {
		return contadorPublicacao;
	}
	public void Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
		
	}

}
	
