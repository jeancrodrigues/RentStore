package com.rentstore.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Pessoajuridica.class)
public class Pessoajuridica_ {
	public static volatile SingularAttribute<Pessoajuridica, Integer> idpessoajuridica;
	public static volatile SingularAttribute<Pessoajuridica, Endereco> endereco;
	public static volatile SingularAttribute<Pessoajuridica, String> razaosocial;
	public static volatile SingularAttribute<Pessoajuridica, String> nomefantasia;
	public static volatile SingularAttribute<Pessoajuridica, String> cnpj;
	public static volatile SingularAttribute<Pessoajuridica, String> telefone1;
	public static volatile SingularAttribute<Pessoajuridica, String> telefone2;
	public static volatile SetAttribute<Pessoajuridica, Boleto> boletos;
	public static volatile SetAttribute<Pessoajuridica, Cliente> clientes;
}
