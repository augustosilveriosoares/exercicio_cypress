package br.com.augusto;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produtos_seq")
	@SequenceGenerator(name="produtos_seq", sequenceName="sq_produtos", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name ="'DESCRICAO" nullable = false)
	private String descricao;
	@Column(name = "VALOR" nullable = false)
	private Double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
