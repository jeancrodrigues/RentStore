package com.rentstore.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Compra.class)
public class Compra_ {
	public static volatile SingularAttribute<Compra, Integer> idcompra;
	public static volatile SingularAttribute<Compra, Funcionario> funcionario;
	public static volatile SingularAttribute<Compra, Veiculo> veiculo;
	public static volatile SingularAttribute<Compra, Date> datacompra;
	public static volatile SingularAttribute<Compra, Date> valorcompra;
}
