package br.com.fornax.samila.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

import br.com.fornax.samila.type.SeguradoType;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-24T17:51:29.311Z")

@Entity
@Table(name = "Segurado")
public class SeguradoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSegurado")
	private Integer idSegurado = null;

	@Column(name = "nome")
	private String nome = null;

	@Column(name = "cpf")
	private Integer cpf = null;

	@Column(name = "email")
	private String email = null;

	@OneToMany(mappedBy = "segurado", cascade = CascadeType.ALL)
	private Set<SeguroEntity> seguros;

	@OneToMany(mappedBy = "segurado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<TelefoneEntity> telefones;

	public Set<SeguroEntity> getSeguros() {
		return seguros;
	}

	public void setSeguros(Set<SeguroEntity> seguros) {
		this.seguros = seguros;
	}

	public Set<TelefoneEntity> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<TelefoneEntity> telefones) {
		this.telefones = telefones;
	}

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