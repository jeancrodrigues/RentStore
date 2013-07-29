package com.rentstore.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.rentstore.dao.ICompraDao;
import com.rentstore.model.Compra;
import com.rentstore.model.CompraVeiculo;
import com.rentstore.model.Funcionario;


@ViewScoped
@ManagedBean

public class CompraBean extends BaseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2369274720531760382L;
	@EJB
	private ICompraDao compraDao;
	private Compra compra;
	private List<CompraVeiculo> listaVeiculos;
	private CompraVeiculo veiculocomprado;
	
	
	@PostConstruct
	private void init(){		

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();		
		Map<String,String> params = context.getRequestParameterMap();
		
		if(params.containsKey("com_id")){
			
			int id = Integer.valueOf(params.get("com_id"));
			postMessage("editando uma compra " + id);
			compra = compraDao.get(id);		
			
		}else{
			Compra compra = new Compra();
			compra.setFuncionario(getUsuarioLogado());
			}
			
		}
	
	
	
	public List<CompraVeiculo> getListaVeiculos() {
		return listaVeiculos;
	}



	public void setListaVeiculos(List<CompraVeiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}



	public CompraVeiculo getVeiculocomprado() {
		return veiculocomprado;
	}



	public void setVeiculocomprado(CompraVeiculo veiculocomprado) {
		this.veiculocomprado = veiculocomprado;
	}



	public ICompraDao getCompraDao() {
		return compraDao;
	}


	public void setCompraDao(ICompraDao compraDao) {
		this.compraDao = compraDao;
	}


	public Compra getCompra() {
		return compra;
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
	public String salvarCompra(){		
		if(!compra.getCompraveiculos().isEmpty()){		
			compraDao.save(compra);
			return "comprasCadastradas?faces-redirect=true";
		}
		
		postMessage("Falha ao salvar.");
		return "";
	}

	
	@Override
	protected void postMessage(String msg) {
		// TODO Auto-generated method stub
		super.postMessage(msg);
	}

	@Override
	protected Funcionario getUsuarioLogado() {
		// TODO Auto-generated method stub
		return super.getUsuarioLogado();
	}
	

}
