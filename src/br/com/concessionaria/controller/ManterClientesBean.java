package br.com.concessionaria.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.concessionaria.dao.IClienteDao;
import br.com.concessionaria.model.Cliente;


@ViewScoped
@ManagedBean
public class ManterClientesBean implements Serializable {
	
	private static final long serialVersionUID =  -3609527376087844387L;
	
	@EJB
	private IClienteDao clienteDao;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ManterClientesBean() {	
		System.out.println("novo manterClientesbean");
	}
	
	public List<Cliente> getClientes(){
		return clienteDao.listAll();
	}
	
	public void excluirCliente(Cliente cli){
		try {
			clienteDao.delete(cli);			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}		
	}
	
	public String cadastroFuncionario(){
		return "cadastroCliente";
	}
}
