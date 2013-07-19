package com.rentstore.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean
public class BaseBean{
		
	protected void postMessage(String msg){		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_WARN , msg,"" ));
		System.out.println(msg);
	}
	
}
