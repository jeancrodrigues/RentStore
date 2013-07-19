package com.rentstore.dao;

import com.rentstore.model.Funcionario;

public interface IFuncionarioDao extends IRentStoreBaseDao<Funcionario> {	
	public Funcionario buscarPorCPF(String cpf);
	public Funcionario buscarLogin(String nomeUsuario);		
}
