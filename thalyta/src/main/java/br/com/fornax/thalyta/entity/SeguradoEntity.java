package br.com.fornax.thalyta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Segurado")
public class SeguradoEntity {

	@Id
	@Column(name = "idSegurado")
	private Integer idSegurado = null;

	@Column(name = "nome")
	private String nome = null;

	@Column(name = "cpf")
	private Integer cpf = null;

	@Column(name = "email")
	private String email = null;
	

	public Integer getIdSegurado() {
		return idSegurado;
	}

	public void setIdSegurado(Integer idSegurado) {
		this.idSegurado = idSegurado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSegurado == null) ? 0 : idSegurado.hashCode());
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
		SeguradoEntity other = (SeguradoEntity) obj;
		if (idSegurado == null) {
			if (other.idSegurado != null)
				return false;
		} else if (!idSegurado.equals(other.idSegurado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeguradoEntity [idSegurado=" + idSegurado + ", nome=" + nome + "]";
	}

}