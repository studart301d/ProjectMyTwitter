package tweet;

public class Tweet{

	private String usuario;
	private String mensagem;

	public Tweet(){

	}

	public void setUsuario(String usuario){
		this.usuario = usuario;
	}

	public String getUsuario(){
		return this.usuario;
	}

	public void setMensagem(String mensagem){
		this.mensagem = mensagem;
	}

	public String getMensagem(){
		return this.mensagem;
	}
	
}