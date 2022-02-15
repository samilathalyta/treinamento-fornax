package br.com.fornax.samila.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-24T17:51:29.311Z")


@Entity
@Table(name = "Tipo")
public class TipoEntity {

	@Id
	@Column(name = "idTipo")
	private Integer idTipo = null;

	@Column(name = "descricao")
	private String descricao = null;
	
	@OneToMany (mappedBy = "tipo", cascade = CascadeType.ALL)
	private  Set<SeguroEntity> seguros;
	
	
	public Set<SeguroEntity> getSeguros() {
		return seguros;
	}

	public void setSeguros(Set<SeguroEntity> seguros) {
		this.seguros = seguros;
	}

	
	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipo == null) ? 0 : idTipo.hashCode());
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
		TipoEntity other = (TipoEntity) obj;
		if (idTipo == null) {
			if (other.idTipo != null)
				return false;
		} else if (!idTipo.equals(other.idTipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoEntity [idTipo=" + idTipo + ", descricao=" + descricao + "]";
	}

}