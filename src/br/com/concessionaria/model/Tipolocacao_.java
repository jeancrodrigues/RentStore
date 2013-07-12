package br.com.concessionaria.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Tipolocacao.class)
public class Tipolocacao_ {
	public static volatile SingularAttribute<Tipolocacao, Integer> idtipolocacao;
	public static volatile SingularAttribute<Tipolocacao, String> tipo;
	public static volatile SingularAttribute<Tipolocacao, String> descricao;
	public static volatile SetAttribute<Tipolocacao, Locacao> locacaos;
}
