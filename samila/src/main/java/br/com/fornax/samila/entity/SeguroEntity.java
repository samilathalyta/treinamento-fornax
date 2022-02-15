package br.com.fornax.samila.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Seguro")
public class SeguroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSeguro")
	private Integer idSeguro;

	@Column(name = "proposta")
	private Integer proposta;

	@Column(name = "apolice")
	private Integer apolice;

	@ManyToOne
	@JoinColumn(name = "Segurado_idSegurado", nullable = false, insertable=true,updatable=true)
	private SeguradoEntity segurado;

	@ManyToOne
	@JoinColumn(name = "Tipo_idTipo", nullable = false, insertable=true,updatable=true)
	private TipoEntity tipo;

	public Integer getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(Integer idSeguro) {
		this.idSeguro = idSeguro;
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

	public SeguradoEntity getSegurado() {
		return segurado;
	}

	public void setSegurado(SeguradoEntity segurado) {
		this.segurado = segurado;
	}

	public TipoEntity getTipo() {
		return tipo;
	}

	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSeguro == null) ? 0 : idSeguro.hashCode());
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
		if (idSeguro == null) {
			if (other.idSeguro != null)
				return false;
		} else if (!idSeguro.equals(other.idSeguro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeguroEntity [idSeguro=" + idSeguro + ", proposta=" + proposta + ", apolice="
				+ apolice + ", segurado=" + segurado + ", tipo=" + tipo + "]";
	}

	

}