package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Telefone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")


public class Telefone   {
  @JsonProperty("idTelefone")
  private Integer idTelefone = null;

  @JsonProperty("ddd")
  private Integer ddd = null;

  @JsonProperty("numero")
  private Integer numero = null;

  /**
   * Gets or Sets tipo
   */
  public enum TipoEnum {
    FIXO("telefone fixo"),
    
    CELULAR("telefone celular");

    private String value;

    TipoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoEnum fromValue(String text) {
      for (TipoEnum b : TipoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tipo")
  private TipoEnum tipo = null;

  public Telefone idTelefone(Integer idTelefone) {
    this.idTelefone = idTelefone;
    return this;
  }

  /**
   * Get idTelefone
   * @return idTelefone
  **/
  @ApiModelProperty(value = "")


  public Integer getIdTelefone() {
    return idTelefone;
  }

  public void setIdTelefone(Integer idTelefone) {
    this.idTelefone = idTelefone;
  }

  public Telefone ddd(Integer ddd) {
    this.ddd = ddd;
    return this;
  }

  /**
   * Get ddd
   * @return ddd
  **/
  @ApiModelProperty(value = "")


  public Integer getDdd() {
    return ddd;
  }

  public void setDdd(Integer ddd) {
    this.ddd = ddd;
  }

  public Telefone numero(Integer numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")


  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Telefone tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")


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
    Telefone telefone = (Telefone) o;
    return Objects.equals(this.idTelefone, telefone.idTelefone) &&
        Objects.equals(this.ddd, telefone.ddd) &&
        Objects.equals(this.numero, telefone.numero) &&
        Objects.equals(this.tipo, telefone.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTelefone, ddd, numero, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telefone {\n");
    
    sb.append("    idTelefone: ").append(toIndentedString(idTelefone)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
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

