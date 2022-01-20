package br.com.fornax.thalyta.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;



/**
 * Tipo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:37:11.793Z")

@Entity
@Table(name = "Tipo")
public class TipoEntity {
	
	@Id
	@Column(name = "idTipo")
	private Integer idTipo = null;

	@Column(name = "descricao")
	private String descricao = null;


	
	
	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public TipoEntity descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	

	@Size(max = 45)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TipoEntity tipo = (TipoEntity) o;
		return Objects.equals(this.idTipo, tipo.idTipo) && Objects.equals(this.descricao, tipo.descricao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTipo, descricao);
	}




	@Override
	public String toString() {
		return "TipoEntity [idTipo=" + idTipo + ", descricao=" + descricao + "]";
	}
	
	

	
}