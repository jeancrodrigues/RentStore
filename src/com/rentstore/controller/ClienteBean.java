package com.rentstore.controller;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.rentstore.dao.IClienteDao;
import com.rentstore.model.Cliente;

@ViewScoped
@ManagedBean
public class ClienteBean extends BaseBean implements Serializable {

	private static final long serialVersionUID = -5686037523430224116L;
	
	@EJB
	private IClienteDao clienteDao;		
	
	private Cliente cliente;
	
	@PostConstruct
	private void init(){		

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();		
		Map<String,String> params = context.getRequestParameterMap();
		
		if(params.containsKey("cli_id")){
			
			int id = Integer.valueOf(params.get("cli_id"));
			postMessage("editando o Cliente " + id);
			cliente = clienteDao.get(id);		
			
		}else{
			this.setCliente(new Cliente(true));
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String salvarCliente(){		
		if((!cliente.getPessoafisica().getCpf().isEmpty())&&(!cliente.getPessoafisica().getNome().isEmpty())){		
			clienteDao.save(cliente);
			return "clientesCadastrados?faces-redirect=true";
		}
		
		postMessage("Falha ao salvar.");
		return "";		
	}	

}
