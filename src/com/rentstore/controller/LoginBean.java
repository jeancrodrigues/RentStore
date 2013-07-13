package com.rentstore.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.rentstore.dao.IFuncionarioDao;
import com.rentstore.model.Funcionario;
import com.rentstore.util.AutenticacaoUtils;

@ManagedBean
public class LoginBean extends BaseBean{

	@EJB
	private IFuncionarioDao dao;
	
	private String nomeUsuario;
	private String senhaUsuario;	
	
	public LoginBean() {
		
	}
	
	public String logar(){		
		
		if(!this.nomeUsuario.equals("") && !this.senhaUsuario.equals("")){
			
			Funcionario func = dao.buscarLogin(nomeUsuario);
			
			if( func!=null && AutenticacaoUtils.autenticarLogin(func, senhaUsuario) ){
				FacesContext context = FacesContext.getCurrentInstance();
				HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
				session.setAttribute("loggeduser", func);
				return "index";
			}			
			
			postMessage("Nome de usuário ou senha inválidos");			
		}	
		
		return null;
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
