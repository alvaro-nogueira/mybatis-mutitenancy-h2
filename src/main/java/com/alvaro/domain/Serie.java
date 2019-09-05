package com.alvaro.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Serie {

	
	private Date data;

	private String id;
	

	private String nome;


	private Integer quantidade;

	private BigDecimal taxa;


	private BigDecimal valor;

	private Integer parcelamentoMedio;

	private BigDecimal comissao;

	private BigDecimal liquido;

	private BigDecimal ticketMedio;

	private Boolean feriado;

	private BigDecimal ticketMedioParcelas2;

	private BigDecimal ticketMedioParcelas3;

	private BigDecimal ticketMedioParcelas4a6;

	private BigDecimal ticketMedioParcelasMais7;


	private BigDecimal vlBrutoParcelas2;


	private BigDecimal vlBrutoParcelas3;


	private BigDecimal vlBrutoParcelas4a6;

	private BigDecimal vlBrutoParcelasMais7;

	private Integer qtdParcelas2;

	private Integer qtdParcelas3;


	private Integer qtdParcelas4a6;

	private Integer qtdParcelasMais7;


	private String banco;

	
	private Integer agencia;


	private String conta;
	

	private String cor;


	private Boolean flNaoAplicavel;


	private Integer transacoes;


	private String estabelecimento;

	public Integer getParcelamentoMedio() {
		return parcelamentoMedio;
	}

	public void setParcelamentoMedio(Integer parcelamentoMedio) {
		this.parcelamentoMedio = parcelamentoMedio;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public BigDecimal getLiquido() {
		return liquido;
	}

	public void setLiquido(BigDecimal liquido) {
		this.liquido = liquido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getFeriado() {
		return feriado;
	}

	public void setFeriado(Boolean feriado) {
		this.feriado = feriado;
	}

	public BigDecimal getTicketMedio() {
		return ticketMedio;
	}

	public void setTicketMedio(BigDecimal ticketMedio) {
		this.ticketMedio = ticketMedio;
	}

	public BigDecimal getTicketMedioParcelas2() {
		return ticketMedioParcelas2;
	}

	public void setTicketMedioParcelas2(BigDecimal ticketMedioParcelas2) {
		this.ticketMedioParcelas2 = ticketMedioParcelas2;
	}

	public BigDecimal getTicketMedioParcelas3() {
		return ticketMedioParcelas3;
	}

	public void setTicketMedioParcelas3(BigDecimal ticketMedioParcelas3) {
		this.ticketMedioParcelas3 = ticketMedioParcelas3;
	}

	public BigDecimal getTicketMedioParcelas4a6() {
		return ticketMedioParcelas4a6;
	}

	public void setTicketMedioParcelas4a6(BigDecimal ticketMedioParcelas4a6) {
		this.ticketMedioParcelas4a6 = ticketMedioParcelas4a6;
	}

	public BigDecimal getTicketMedioParcelasMais7() {
		return ticketMedioParcelasMais7;
	}

	public void setTicketMedioParcelasMais7(BigDecimal ticketMedioParcelasMais7) {
		this.ticketMedioParcelasMais7 = ticketMedioParcelasMais7;
	}

	public BigDecimal getVlBrutoParcelas2() {
		return vlBrutoParcelas2;
	}

	public void setVlBrutoParcelas2(BigDecimal vlBrutoParcelas2) {
		this.vlBrutoParcelas2 = vlBrutoParcelas2;
	}

	public BigDecimal getVlBrutoParcelas3() {
		return vlBrutoParcelas3;
	}

	public void setVlBrutoParcelas3(BigDecimal vlBrutoParcelas3) {
		this.vlBrutoParcelas3 = vlBrutoParcelas3;
	}

	public BigDecimal getVlBrutoParcelas4a6() {
		return vlBrutoParcelas4a6;
	}

	public void setVlBrutoParcelas4a6(BigDecimal vlBrutoParcelas4a6) {
		this.vlBrutoParcelas4a6 = vlBrutoParcelas4a6;
	}

	public BigDecimal getVlBrutoParcelasMais7() {
		return vlBrutoParcelasMais7;
	}

	public void setVlBrutoParcelasMais7(BigDecimal vlBrutoParcelasMais7) {
		this.vlBrutoParcelasMais7 = vlBrutoParcelasMais7;
	}

	public Integer getQtdParcelas2() {
		return qtdParcelas2;
	}

	public void setQtdParcelas2(Integer qtdParcelas2) {
		this.qtdParcelas2 = qtdParcelas2;
	}

	public Integer getQtdParcelas3() {
		return qtdParcelas3;
	}

	public void setQtdParcelas3(Integer qtdParcelas3) {
		this.qtdParcelas3 = qtdParcelas3;
	}

	public Integer getQtdParcelas4a6() {
		return qtdParcelas4a6;
	}

	public void setQtdParcelas4a6(Integer qtdParcelas4a6) {
		this.qtdParcelas4a6 = qtdParcelas4a6;
	}

	public Integer getQtdParcelasMais7() {
		return qtdParcelasMais7;
	}

	public void setQtdParcelasMais7(Integer qtdParcelasMais7) {
		this.qtdParcelasMais7 = qtdParcelasMais7;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getFlNaoAplicavel() {
		return flNaoAplicavel;
	}

	public void setFlNaoAplicavel(Boolean flNaoAplicavel) {
		this.flNaoAplicavel = flNaoAplicavel;
	}

	public Integer getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(Integer transacoes) {
		this.transacoes = transacoes;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
}