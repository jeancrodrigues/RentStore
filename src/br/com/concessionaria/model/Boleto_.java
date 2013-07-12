package br.com.concessionaria.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.390-0300")
@StaticMetamodel(Boleto.class)
public class Boleto_ {
	public static volatile SingularAttribute<Boleto, Integer> idboleto;
	public static volatile SingularAttribute<Boleto, Pessoajuridica> pessoajuridica;
	public static volatile SingularAttribute<Boleto, Funcionario> funcionario;
	public static volatile SingularAttribute<Boleto, Pagamento> pagamento;
	public static volatile SingularAttribute<Boleto, String> codigobarras;
	public static volatile SingularAttribute<Boleto, BigDecimal> valor;
	public static volatile SingularAttribute<Boleto, BigDecimal> valorpago;
	public static volatile SingularAttribute<Boleto, Date> datavencimento;
	public static volatile SingularAttribute<Boleto, Date> datapagamento;
}
