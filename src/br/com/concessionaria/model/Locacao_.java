package br.com.concessionaria.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Locacao.class)
public class Locacao_ {
	public static volatile SingularAttribute<Locacao, Integer> idlocacao;
	public static volatile SingularAttribute<Locacao, Tipolocacao> tipolocacao;
	public static volatile SingularAttribute<Locacao, Motorista> motorista;
	public static volatile SingularAttribute<Locacao, Funcionario> funcionario;
	public static volatile SingularAttribute<Locacao, Veiculo> veiculo;
	public static volatile SingularAttribute<Locacao, Pagamento> pagamento;
	public static volatile SingularAttribute<Locacao, Cliente> cliente;
	public static volatile SingularAttribute<Locacao, Date> datalocacao;
	public static volatile SingularAttribute<Locacao, Date> datadevolucao;
	public static volatile SetAttribute<Locacao, Manutencao> manutencaos;
}
