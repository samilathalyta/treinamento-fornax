package br.com.fornax.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.fornax.type.TipoType;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Seguro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")


public class SeguroType   {
  @JsonProperty("idSeguro")
  private Integer idSeguro = null;

  @JsonProperty("proposta")
  private Integer proposta = null;

  @JsonProperty("apolice")
  private Integer apolice = null;

  @JsonProperty("tipo")
  private TipoType tipo = null;

  public SeguroType idSeguro(Integer idSeguro) {
    this.idSeguro = idSeguro;
    return this;
  }

  /**
   * Get idSeguro
   * @return idSeguro
  **/
  @ApiModelProperty(value = "")


  public Integer getIdSeguro() {
    return idSeguro;
  }

  public void setIdSeguro(Integer idSeguro) {
    this.idSeguro = idSeguro;
  }

  public SeguroType proposta(Integer proposta) {
    this.proposta = proposta;
    return this;
  }

  /**
   * Get proposta
   * @return proposta
  **/
  @ApiModelProperty(value = "")


  public Integer getProposta() {
    return proposta;
  }

  public void setProposta(Integer proposta) {
    this.proposta = proposta;
  }

  public SeguroType apolice(Integer apolice) {
    this.apolice = apolice;
    return this;
  }

  /**
   * Get apolice
   * @return apolice
  **/
  @ApiModelProperty(value = "")


  public Integer getApolice() {
    return apolice;
  }

  public void setApolice(Integer apolice) {
    this.apolice = apolice;
  }

  public SeguroType tipo(TipoType tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TipoType getTipo() {
    return tipo;
  }

  public void setTipo(TipoType tipo) {
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
    SeguroType seguro = (SeguroType) o;
    return Objects.equals(this.idSeguro, seguro.idSeguro) &&
        Objects.equals(this.proposta, seguro.proposta) &&
        Objects.equals(this.apolice, seguro.apolice) &&
        Objects.equals(this.tipo, seguro.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSeguro, proposta, apolice, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seguro {\n");
    
    sb.append("    idSeguro: ").append(toIndentedString(idSeguro)).append("\n");
    sb.append("    proposta: ").append(toIndentedString(proposta)).append("\n");
    sb.append("    apolice: ").append(toIndentedString(apolice)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

