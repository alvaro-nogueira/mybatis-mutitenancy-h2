package com.alvaro.domain;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Categoria {

	private String id;

	private String nome;

	private String cor;

	private Date data;

	private BigDecimal total;

	private List<Serie> series = new ArrayList<Serie>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
