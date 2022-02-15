package br.com.fornax.samila.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.fornax.samila.type.TelefoneType;
import br.com.fornax.samila.type.TelefoneType.TipoEnum;

@Entity
@Table (name = "Telefone")
public class TelefoneEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idTelefone")
	private Integer idTelefone = null;

	@Column (name = "ddd")
	  private Integer ddd = null;

	@Column (name = "numero")
	  private Integer numero = null;

	
	@Column (name = "tipo")
	@Enumerated(EnumType.STRING)
	  private TipoEnum tipo = null;
	
	@ManyToOne
	@JoinColumn(name="Segurado_idSegurado", nullable = false)
	private SeguradoEntity segurado;
	


	  public SeguradoEntity getSegurado() {
		return segurado;
	}

	public void setSegurado(SeguradoEntity segurado) {
		this.segurado = segurado;
	}

	public Integer getIdTelefone() {
	    return idTelefone;
	  }

	  public void setIdTelefone(Integer idTelefone) {
	    this.idTelefone = idTelefone;
	  }

	  public TelefoneEntity ddd(Integer ddd) {
	    this.ddd = ddd;
	    return this;
	  }

	 


	  public Integer getDdd() {
	    return ddd;
	  }

	  public void setDdd(Integer ddd) {
	    this.ddd = ddd;
	  }

	  public TelefoneEntity numero(Integer numero) {
	    this.numero = numero;
	    return this;
	  }

	

	  public Integer getNumero() {
	    return numero;
	  }

	  public void setNumero(Integer numero) {
	    this.numero = numero;
	  }

	  public TelefoneEntity tipo(TipoEnum tipo) {
	    this.tipo = tipo;
	    return this;
	  }

	 


	  public TipoEnum getTipo() {
	    return tipo;
	  }

	  public void setTipo(TipoEnum tipo) {
	    this.tipo = tipo;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    TelefoneType telefone = (TelefoneType) o;
	    return Objects.equals(this.idTelefone, telefone.getIdTelefone()) &&
	        Objects.equals(this.ddd, telefone.getDdd()) &&
	        Objects.equals(this.numero, telefone.getNumero()) &&
	        Objects.equals(this.tipo, telefone.getTipo());
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(idTelefone, ddd, numero, tipo);
	  }


	@Override
	public String toString() {
		return "TelefoneEntity [idTelefone=" + idTelefone + ", tipo=" + tipo + "]";
	}

	  
	


	
}
