package com.rentstore.dao;

import java.util.List;

public interface IRentStoreBaseDao<T> {
	/**
	 ** Nome da unidade de persistencia comum para todos os daos  
	 **/
	public static final String PersUnit = "RentStore"; 
	
	public T save(T object);
	public T get(int primaryKey);
	public void update(T object);
	public void delete(T object);
	public List<T> listAll();
}
