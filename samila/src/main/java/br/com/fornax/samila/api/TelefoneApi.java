package br.com.fornax.samila.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fornax.samila.type.TelefoneType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T17:08:57.672Z")

@Validated
@Api(value = "tipo", description = "the tipo API")
@RequestMapping(value = "/v1")
public interface TelefoneApi {

	@ApiOperation(value = "Atualizar telefone", nickname = "atualizarTelefone", notes = "Atualizar telefone no banco de dados", response = TelefoneType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = TelefoneType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/telefone", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<TelefoneType> atualizar(@ApiParam(value = "") @Valid @RequestBody TelefoneType body);

	@ApiOperation(value = "Consultar tipo", nickname = "consultarTelefone", notes = "Consultar tipo", response = TelefoneType.class, responseContainer = "List", tags = {
			"tipo", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "sucessful operation", response = TelefoneType.class, responseContainer = "List"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/telefone", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<TelefoneType>> consultar();

	@ApiOperation(value = "Deletar Telefone", nickname = "deletarTelefone", notes = "Deletar Telefone por por Id", response = TelefoneType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = TelefoneType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/telefone/{idTelefone}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deletar(
			@ApiParam(value = "Id do tipo", required = true) @PathVariable("idTipo") Integer idTelefone);

	@ApiOperation(value = "Salvar tipo", nickname = "salvarTelefone", notes = "Salvar Telefone no banco de dados", response = TelefoneType.class, tags = {
			"tipo", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "sucessful operation", response = TelefoneType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Tipo not found") })
	@RequestMapping(value = "/telefone", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<TelefoneType> salvar(@ApiParam(value = "") @Valid @RequestBody TelefoneType body);

}