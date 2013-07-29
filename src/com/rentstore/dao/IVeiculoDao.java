package com.rentstore.dao;

import com.rentstore.model.Veiculo;

public interface IVeiculoDao extends IRentStoreBaseDao<Veiculo> {
	public Veiculo buscarPorChassi(String chassi);
}
