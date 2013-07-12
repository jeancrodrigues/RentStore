package br.com.concessionaria.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.406-0300")
@StaticMetamodel(Manutencao.class)
public class Manutencao_ {
	public static volatile SingularAttribute<Manutencao, Integer> idmanutencao;
	public static volatile SingularAttribute<Manutencao, Funcionario> funcionario;
	public static volatile SingularAttribute<Manutencao, Veiculo> veiculo;
	public static volatile SingularAttribute<Manutencao, Locacao> locacao;
	public static volatile SingularAttribute<Manutencao, Date> datainicio;
	public static volatile SingularAttribute<Manutencao, Date> datatermino;
	public static volatile SingularAttribute<Manutencao, String> observacoes;
}
