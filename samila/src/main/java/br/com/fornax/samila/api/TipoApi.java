package br.com.fornax.samila.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fornax.samila.type.SeguroType;
import br.com.fornax.samila.type.TipoType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T17:08:57.672Z")

@Validated
@Api(value = "tipo", description = "the tipo API")
@RequestMapping(value = "/v1")
public interface TipoApi {

	@ApiOperation(value = "Atualizar tipo", nickname = "atualizarTipo", notes = "Atualizar tipo no banco de dados", response = SeguroType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = SeguroType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/tipo", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<TipoType> atualizarTipo(@ApiParam(value = "") @Valid @RequestBody TipoType body);

	@ApiOperation(value = "Consultar tipo", nickname = "consultarTipo", notes = "Consultar tipo", response = TipoType.class, responseContainer = "List", tags = {
			"tipo", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class, responseContainer = "List"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/tipo", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<TipoType>> consultarTipo();

	@ApiOperation(value = "Deletar tipo", nickname = "deletarTipo", notes = "Deletar tipo por por Id", response = TipoType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/tipo/{idTipo}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deletarTipo(
			@ApiParam(value = "Id do tipo", required = true) @PathVariable("idTipo") Integer tipo);

	@ApiOperation(value = "Salvar tipo", nickname = "salvarTipo", notes = "Salvar tipo no banco de dados", response = TipoType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/tipo", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<TipoType> salvarTipo(@ApiParam(value = "") @Valid @RequestBody TipoType body);

}