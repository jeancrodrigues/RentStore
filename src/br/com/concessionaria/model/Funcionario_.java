package br.com.concessionaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:49:06.218-0300")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ {
	public static volatile SingularAttribute<Funcionario, Integer> idfuncionario;
	public static volatile SingularAttribute<Funcionario, Pessoafisica> pessoafisica;
	public static volatile SingularAttribute<Funcionario, String> senha;
	public static volatile SingularAttribute<Funcionario, String> usuario;
	public static volatile SetAttribute<Funcionario, Setor> setores;
}
