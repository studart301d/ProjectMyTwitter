package exception;

import perfil.*;

public class UNCException extends java.lang.Exception{
	private Perfil usuario;
	
	public UNCException (Perfil usuario) {
		super("Usuario nao cadastrado");
		this.usuario = usuario;
	}
	
	public Perfil getUsuario() {
		return this.usuario;
	}
}