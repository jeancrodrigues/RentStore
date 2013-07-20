package com.rentstore.dao;

import com.rentstore.model.Cliente;

/**
 * Interface que extende(herda) da interface IRentStoreBaseDao
 * 
 * 
 * @author Rafael
 * 
 * 
 *
 */
public interface IClienteDao extends IRentStoreBaseDao<Cliente>{
	public Cliente buscarPorCPF (String cpf);
	public Cliente buscarPorCnpj(String cnpj);
}
