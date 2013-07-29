package com.rentstore.dao;

import com.rentstore.model.Compra;

public interface ICompraDao extends IRentStoreBaseDao<Compra>{
	public Compra buscarPorCompra (String idCompra);
	public Compra buscarPorVeiculo(String idVeiculo);
	
}
