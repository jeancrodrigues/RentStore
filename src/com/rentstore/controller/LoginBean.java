package com.rentstore.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

import com.rentstore.dao.IFuncionarioDao;
import com.rentstore.model.Funcionario;
import com.rentstore.util.AutenticacaoUtils;

@ViewScoped
@ManagedBean
public class LoginBean extends BaseBean implements Serializable{
	
	@EJB
	SessionBean sbean;
	
	/**
	 * generated
	 */
	private static final long serialVersionUID = 4231238437224595160L;

	@EJB
	private IFuncionarioDao dao;
	
	@NotNull
	private String nomeUsuario;
	
	@NotNull
	private String senhaUsuario;	
	
	public LoginBean() {		
		sbean.logout();
	}
	
	public String logar(){		
		
		if(!this.nomeUsuario.equals("") && !this.senhaUsuario.equals("")){
			
			Funcionario func = dao.buscarLogin(nomeUsuario);
			
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
			
			if( func!=null && AutenticacaoUtils.autenticarLogin(func, senhaUsuario) ){
				session.setAttribute("loggeduser", func);
				return "index";
			}
			postMessage("Nome de usuário ou senha inválidos.");			
		}else{
			postMessage("Campos não podem ser nulos.");
			
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
