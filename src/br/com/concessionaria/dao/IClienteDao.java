package br.com.concessionaria.dao;

import br.com.concessionaria.model.Cliente;

public interface IClienteDao extends IRentStoreBaseDao<Cliente>{
	public Cliente buscarPorCPF (String CPF);
}
