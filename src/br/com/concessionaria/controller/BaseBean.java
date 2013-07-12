package br.com.concessionaria.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BaseBean{	
	protected void postMessage(String msg){		
//		FacesContext context = FacesContext.getCurrentInstance();		
//		context.addMessage(null, new FacesMessage(msg));
		System.out.println(msg);
	}
}
