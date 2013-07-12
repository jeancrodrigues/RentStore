package br.com.concessionaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Setor.class)
public class Setor_ {
	public static volatile SingularAttribute<Setor, Integer> idsetor;
	public static volatile SingularAttribute<Setor, String> nome;
	public static volatile SetAttribute<Setor, Funcionario> funcionarios;
}
