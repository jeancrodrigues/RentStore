package br.com.concessionaria.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Motorista.class)
public class Motorista_ {
	public static volatile SingularAttribute<Motorista, Integer> idmotorista;
	public static volatile SingularAttribute<Motorista, Pessoafisica> pessoafisica;
	public static volatile SingularAttribute<Motorista, String> registro;
	public static volatile SingularAttribute<Motorista, Date> dataemissao;
	public static volatile SingularAttribute<Motorista, Date> datavalidade;
	public static volatile SetAttribute<Motorista, Locacao> locacaos;
}
