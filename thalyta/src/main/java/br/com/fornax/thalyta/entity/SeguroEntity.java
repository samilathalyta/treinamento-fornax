package br.com.fornax.thalyta.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Seguro")
public class SeguroEntity {

	@Id
	@Column(name = "idSeguro")
	private Integer idSeguro = null;

	@Column(name = "proposta")
	private Integer proposta = null;

	@Column(name = "apolice")
	private Integer apolice = null;

	public Integer getIdSeguro() {
		return idSeguro;
	}

	public Integer getProposta() {
		return proposta;
	}

	public void setProposta(Integer proposta) {
		this.proposta = proposta;
	}

	public Integer getApolice() {
		return apolice;
	}

	public void setApolice(Integer apolice) {
		this.apolice = apolice;
	}

	public void setIdSeguro(Integer idSeguro) {
		this.idSeguro = idSeguro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apolice == null) ? 0 : apolice.hashCode());
		result = prime * result + ((idSeguro == null) ? 0 : idSeguro.hashCode());
		result = prime * result + ((proposta == null) ? 0 : proposta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeguroEntity other = (SeguroEntity) obj;
		if (apolice == null) {
			if (other.apolice != null)
				return false;
		} else if (!apolice.equals(other.apolice))
			return false;
		if (idSeguro == null) {
			if (other.idSeguro != null)
				return false;
		} else if (!idSeguro.equals(other.idSeguro))
			return false;
		if (proposta == null) {
			if (other.proposta != null)
				return false;
		} else if (!proposta.equals(other.proposta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeguroEntity [idSeguro=" + idSeguro + ", proposta=" + proposta + ", apolice=" + apolice + "]";
	}

	
}
