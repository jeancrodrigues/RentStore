package com.rentstore.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Venda.class)
public class Venda_ {
	public static volatile SingularAttribute<Venda, Integer> idvenda;
	public static volatile SingularAttribute<Venda, Funcionario> funcionario;
	public static volatile SingularAttribute<Venda, Veiculo> veiculo;
	public static volatile SingularAttribute<Venda, Date> datavenda;
	public static volatile SingularAttribute<Venda, Date> valorvenda;
}
