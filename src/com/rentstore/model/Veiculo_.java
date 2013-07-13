package com.rentstore.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-07-11T17:46:00.421-0300")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ {
	public static volatile SingularAttribute<Veiculo, Integer> idveiculo;
	public static volatile SingularAttribute<Veiculo, Combustivel> combustivel;
	public static volatile SingularAttribute<Veiculo, String> modelo;
	public static volatile SingularAttribute<Veiculo, String> marca;
	public static volatile SingularAttribute<Veiculo, Date> anomodelo;
	public static volatile SingularAttribute<Veiculo, Date> anofabricacao;
	public static volatile SingularAttribute<Veiculo, Integer> quilometragem;
	public static volatile SetAttribute<Veiculo, Locacao> locacaos;
	public static volatile SetAttribute<Veiculo, Venda> vendas;
	public static volatile SetAttribute<Veiculo, Compra> compras;
	public static volatile SetAttribute<Veiculo, Manutencao> manutencaos;
}
