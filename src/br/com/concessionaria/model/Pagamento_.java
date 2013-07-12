package br.com.concessionaria.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ {
	public static volatile SingularAttribute<Pagamento, Integer> idpagamento;
	public static volatile SingularAttribute<Pagamento, Funcionario> funcionario;
	public static volatile SingularAttribute<Pagamento, Promocao> promocao;
	public static volatile SingularAttribute<Pagamento, BigDecimal> valor;
	public static volatile SingularAttribute<Pagamento, Date> datalancamento;
	public static volatile SingularAttribute<Pagamento, Date> datapagamento;
	public static volatile SetAttribute<Pagamento, Locacao> locacaos;
	public static volatile SetAttribute<Pagamento, Boleto> boletos;
}
