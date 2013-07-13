package com.rentstore.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Combustivel.class)
public class Combustivel_ {
	public static volatile SingularAttribute<Combustivel, Integer> idcombustivel;
	public static volatile SingularAttribute<Combustivel, String> nome;
	public static volatile SetAttribute<Combustivel, Veiculo> veiculos;
}
