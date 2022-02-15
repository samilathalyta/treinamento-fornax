package br.com.fornax.samila.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Segurado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")


public class SeguradoType   {
  @JsonProperty("idSegurado")
public Integer idSegurado = null;

  @JsonProperty("nome")
public String nome = null;

  @JsonProperty("cpf")
  private Integer cpf = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("telefones")
  @Valid
  private List<TelefoneType> telefones = null;

  @JsonProperty("seguro")
  @Valid
  private List<SeguroType> seguros = null;



  public SeguradoType idSegurado(Integer idSegurado) {
    this.idSegurado = idSegurado;
    return this;
  }

  /**
   * Get idSegurado
   * @return idSegurado
  **/
  @ApiModelProperty(value = "")


  public Integer getIdSegurado() {
    return idSegurado;
  }

  public void setIdSegurado(Integer idSegurado) {
    this.idSegurado = idSegurado;
  }

  public SeguradoType nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do segurado
   * @return nome
  **/
  @ApiModelProperty(example = "Conrado", required = true, value = "Nome do segurado")
  @NotNull

@Size(max=150) 
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public SeguradoType cpf(Integer cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(value = "")


  public Integer getCpf() {
    return cpf;
  }

  public void setCpf(Integer cpf) {
    this.cpf = cpf;
  }

  public SeguradoType email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=150) 
  public String getEmail() {
    return email;
  }

  public Integer getId() {
	return idSegurado;
}

public void setId(Integer id) {
	this.idSegurado = id;
}

public void setEmail(String email) {
    this.email = email;
  }

  public SeguradoType telefones(List<TelefoneType> telefones) {
    this.telefones = telefones;
    return this;
  }

  public SeguradoType addTelefonesItem(TelefoneType telefonesItem) {
    if (this.telefones == null) {
      this.telefones = new ArrayList<TelefoneType>();
    }
    this.telefones.add(telefonesItem);
    return this;
  }

  /**
   * Get telefones
   * @return telefones
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TelefoneType> getTelefones() {
    return telefones;
  }

  public void setTelefones(List<TelefoneType> telefones) {
    this.telefones = telefones;
  }

  public SeguradoType seguros(List<SeguroType> seguros) {
    this.seguros = seguros;
    return this;
  }

  public SeguradoType addSegurosItem(SeguroType segurosItem) {
    if (this.seguros == null) {
      this.seguros = new ArrayList<SeguroType>();
    }
    this.seguros.add(segurosItem);
    return this;
  }

  /**
   * Get seguro
   * @return seguro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SeguroType> getSeguro() {
    return seguros;
  }

  public void setSeguro(List<SeguroType> seguro) {
    this.seguros = seguro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeguradoType segurado = (SeguradoType) o;
    return Objects.equals(this.idSegurado, segurado.idSegurado) &&
        Objects.equals(this.nome, segurado.nome) &&
        Objects.equals(this.cpf, segurado.cpf) &&
        Objects.equals(this.email, segurado.email) &&
        Objects.equals(this.telefones, segurado.telefones) &&
        Objects.equals(this.seguros, segurado.seguros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSegurado, nome, cpf, email, telefones, seguros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segurado {\n");
    
    sb.append("    idSegurado: ").append(toIndentedString(idSegurado)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguros)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

