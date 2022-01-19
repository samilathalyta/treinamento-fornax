package br.com.fornax.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.fornax.type.TipoType;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tipo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")


@Entity
@Table (name = "Tipo")
public class TipoEntity   {
	
	@Id
	@Column (name = "idTipo")

  @JsonProperty("idTipo")
  private Integer idTipo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  public TipoEntity idTipo(Integer idTipo) {
    this.idTipo = idTipo;
    return this;
  }

  /**
   * Get idTipo
   * @return idTipo
  **/
  @ApiModelProperty(value = "")


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

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=150) 
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
    TipoType tipo = (TipoType) o;
    return Objects.equals(this.idTipo, tipo.getIdTipo()) &&
        Objects.equals(this.descricao, tipo.getDescricao());
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipo, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tipo {\n");
    
    sb.append("    idTipo: ").append(toIndentedString(idTipo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

