package com.rentstore.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.rentstore.model.Funcionario;

@ViewScoped
@ManagedBean
public class BaseBean{
		
	protected void postMessage(String msg){		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_WARN , msg,"" ));
		System.out.println(msg);
	}
	
	protected Funcionario getUsuarioLogado(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session = (HttpSession) externalContext.getSession(false);
		Funcionario func = (Funcionario)session.getAttribute("loggeduser");
		return func;		
	}
	
}
