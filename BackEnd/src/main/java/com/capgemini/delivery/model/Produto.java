package com.capgemini.delivery.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity(name = "TB_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	
	@Column(name = "Preco")
	private double preco;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Produto> ingredientes;
	@ManyToMany(cascade = CascadeType.ALL)
	
	private List<Produto> adicionais;
	private String observacao;
	private Tipo tipo;
	
	public Produto(String titulo, double preco, List<Produto> ingredientes, List<Produto> adicionais, String observacao,
			Tipo tipo, long id) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.ingredientes = ingredientes;
		this.adicionais = adicionais;
		this.observacao = observacao;
		this.tipo = tipo;
		this.id = id;
	}

	public Produto() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Produto> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Produto> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<Produto> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(List<Produto> adicionais) {
		this.adicionais = adicionais;
	}

	public String getobservacao() {
		return observacao;
	}

	public void setobservacao(String observacao) {
		this.observacao = observacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", titulo=" + titulo + ", preco=" + preco + ", ingredientes=" + ingredientes
				+ ", adicionais=" + adicionais + ", observacao=" + observacao + ", tipo=" + tipo + "]";
	}
	
}
