package com.rentstore.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.rentstore.model.Funcionario;

@SessionScoped
@ManagedBean
public class SessionBean {
	
	private String loggedUserName;
	private boolean usuarioLogado;
	
	private String backUrl, nextUrl;
	
	public SessionBean() {
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session = (HttpSession) context.getSession(true);
		Funcionario funcionario = (Funcionario) session.getAttribute("loggeduser");
		
		if(funcionario!=null){
			this.usuarioLogado = true;
			this.loggedUserName = funcionario.getUsuario();
		}else{
			this.usuarioLogado = false;
		}
	}
	
	public String logout(){
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session = (HttpSession) context.getSession(true);
		session.invalidate();
		return "login";
	}
	
	public String getLoggedUserName() {
		return this.loggedUserName;
	}

	public boolean isUsuarioLogado() {
		return usuarioLogado;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getNextUrl() {
		return nextUrl;
	}

	public void setNextUrl(String nextUrl) {
		this.nextUrl = nextUrl;
	}
	
	
}
