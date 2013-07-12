package br.com.concessionaria.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Promocao.class)
public class Promocao_ {
	public static volatile SingularAttribute<Promocao, Integer> idpromocao;
	public static volatile SingularAttribute<Promocao, String> nome;
	public static volatile SingularAttribute<Promocao, String> descricao;
	public static volatile SingularAttribute<Promocao, Date> datainicio;
	public static volatile SingularAttribute<Promocao, Date> datatermino;
	public static volatile SetAttribute<Promocao, Pagamento> pagamentos;
}
