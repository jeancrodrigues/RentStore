package br.com.concessionaria.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

	private String nomeUsuario;
	private String senhaUsuario;	
	
	public LoginBean() {
		
	}
	
	public String logar(){
		return "index";
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

}
