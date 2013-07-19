package com.rentstore.dao;

import com.rentstore.model.Cliente;

public interface IClienteDao extends IRentStoreBaseDao<Cliente>{
	public Cliente buscarPorCPF (String CPF);
}
