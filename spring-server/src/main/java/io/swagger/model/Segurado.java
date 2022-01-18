package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Seguro;
import io.swagger.model.Telefone;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Segurado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")


public class Segurado   {
  @JsonProperty("idSegurado")
  private Integer idSegurado = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cpf")
  private Integer cpf = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("telefones")
  @Valid
  private List<Telefone> telefones = null;

  @JsonProperty("seguro")
  @Valid
  private List<Seguro> seguro = null;

  public Segurado idSegurado(Integer idSegurado) {
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

  public Segurado nome(String nome) {
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

  public Segurado cpf(Integer cpf) {
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

  public Segurado email(String email) {
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

  public void setEmail(String email) {
    this.email = email;
  }

  public Segurado telefones(List<Telefone> telefones) {
    this.telefones = telefones;
    return this;
  }

  public Segurado addTelefonesItem(Telefone telefonesItem) {
    if (this.telefones == null) {
      this.telefones = new ArrayList<Telefone>();
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

  public List<Telefone> getTelefones() {
    return telefones;
  }

  public void setTelefones(List<Telefone> telefones) {
    this.telefones = telefones;
  }

  public Segurado seguro(List<Seguro> seguro) {
    this.seguro = seguro;
    return this;
  }

  public Segurado addSeguroItem(Seguro seguroItem) {
    if (this.seguro == null) {
      this.seguro = new ArrayList<Seguro>();
    }
    this.seguro.add(seguroItem);
    return this;
  }

  /**
   * Get seguro
   * @return seguro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Seguro> getSeguro() {
    return seguro;
  }

  public void setSeguro(List<Seguro> seguro) {
    this.seguro = seguro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segurado segurado = (Segurado) o;
    return Objects.equals(this.idSegurado, segurado.idSegurado) &&
        Objects.equals(this.nome, segurado.nome) &&
        Objects.equals(this.cpf, segurado.cpf) &&
        Objects.equals(this.email, segurado.email) &&
        Objects.equals(this.telefones, segurado.telefones) &&
        Objects.equals(this.seguro, segurado.seguro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSegurado, nome, cpf, email, telefones, seguro);
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
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
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

