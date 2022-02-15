package br.com.fornax.samila.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Tipo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:37:11.793Z")

public class TipoType {
	@JsonProperty("idTipo")
	private Integer idTipo = null;

	@JsonProperty("descricao")
	private String descricao = null;
	
	

	public TipoType idTipo(Integer idTipo) {
		this.idTipo = idTipo;
		return this;
	}

	/**
	 * Get idTipo
	 * 
	 * @return idTipo
	 **/
	@ApiModelProperty(example = "1", value = "")

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public TipoType descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	/**
	 * Get descricao
	 * 
	 * @return descricao
	 **/
	@ApiModelProperty(example = "RE", value = "")

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
		TipoType tipo = (TipoType) o;
		return Objects.equals(this.idTipo, tipo.idTipo) && Objects.equals(this.descricao, tipo.descricao);
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