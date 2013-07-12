package br.com.concessionaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Endereco.class)
public class Endereco_ {
	public static volatile SingularAttribute<Endereco, Integer> idendereco;
	public static volatile SingularAttribute<Endereco, String> logradouro;
	public static volatile SingularAttribute<Endereco, String> numero;
	public static volatile SingularAttribute<Endereco, String> bairro;
	public static volatile SingularAttribute<Endereco, String> cidade;
	public static volatile SingularAttribute<Endereco, String> uf;
	public static volatile SingularAttribute<Endereco, String> complemento;
	public static volatile SetAttribute<Endereco, Pessoajuridica> pessoajuridicas;
	public static volatile SetAttribute<Endereco, Pessoafisica> pessoafisicas;
}
