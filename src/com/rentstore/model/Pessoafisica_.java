package com.rentstore.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Pessoafisica.class)
public class Pessoafisica_ {
	public static volatile SingularAttribute<Pessoafisica, Integer> idpessoafisica;
	public static volatile SingularAttribute<Pessoafisica, Endereco> endereco;
	public static volatile SingularAttribute<Pessoafisica, String> nome;
	public static volatile SingularAttribute<Pessoafisica, Date> datanascimento;
	public static volatile SingularAttribute<Pessoafisica, String> cpf;
	public static volatile SingularAttribute<Pessoafisica, String> rg;
	public static volatile SingularAttribute<Pessoafisica, String> telefone1;
	public static volatile SingularAttribute<Pessoafisica, String> telefone2;
	public static volatile SetAttribute<Pessoafisica, Motorista> motoristas;
	public static volatile SetAttribute<Pessoafisica, Cliente> clientes;
	public static volatile SetAttribute<Pessoafisica, Funcionario> funcionarios;
}
