package br.org.com.prl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Promocao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPacote;
	private String nomePacote;
	private String observacao;
	private double percentual;

	public Promocao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promocao(Long idPacote, String nomePacote, String observacao, double percentual) {
		this.idPacote = idPacote;
		this.nomePacote = nomePacote;
		this.observacao = observacao;
		this.percentual = percentual;
	}

	public Long getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(Long idPacote) {
		this.idPacote = idPacote;
	}

	public String getNomePacote() {
		return nomePacote;
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

}