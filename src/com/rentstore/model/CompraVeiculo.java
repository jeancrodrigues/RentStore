package com.rentstore.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compraVeiculo", catalog = "concessionaria")
public class CompraVeiculo implements java.io.Serializable {

	private static final long serialVersionUID = 2274512512481463225L;

	private Integer idcompraveiculos;
	private String nome;

	@ManyToOne
	@JoinColumn(name = "compra_id")
	private Compra compra;

	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idcompraveiculo", unique = true, nullable = false)
	public Integer getIdCompraVeiculo() {
		return this.idcompraveiculos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
