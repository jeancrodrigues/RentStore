package com.rentstore.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> idcliente;
	public static volatile SingularAttribute<Cliente, Pessoafisica> pessoafisica;
	public static volatile SingularAttribute<Cliente, Pessoajuridica> pessoajuridica;
	public static volatile SingularAttribute<Cliente, Date> datacadastro;
	public static volatile SetAttribute<Cliente, Locacao> locacaos;
}
