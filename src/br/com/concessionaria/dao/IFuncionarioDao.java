package br.com.concessionaria.dao;

import br.com.concessionaria.model.Funcionario;

public interface IFuncionarioDao extends IRentStoreBaseDao<Funcionario> {	
	public Funcionario buscarPorCPF(String cpf);		
}
