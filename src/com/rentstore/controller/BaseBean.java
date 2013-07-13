package com.rentstore.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.rentstore.model.Funcionario;

@ManagedBean
public class BaseBean{
	
	private String loggedUserName;
	private boolean usuarioLogado; 
	
	public BaseBean() {
		
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
	
	protected void postMessage(String msg){		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_WARN , msg,"" ));
		System.out.println(msg);
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
}
