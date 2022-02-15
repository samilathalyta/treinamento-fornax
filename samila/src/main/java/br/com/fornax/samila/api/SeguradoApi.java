/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.fornax.samila.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fornax.samila.type.SeguradoType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Validated
@Api(value = "segurado", description = "the segurado API")
@RequestMapping(value = "/v1")
public interface SeguradoApi {

	@ApiOperation(value = "Atualizar segurado", nickname = "atualizar", notes = "Atualizar segurado no banco de dados", response = SeguradoType.class, tags = {
			"segurado", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = SeguradoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Segurado not found") })
	@RequestMapping(value = "/segurado", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<SeguradoType> atualizar(
			@ApiParam(value = "", required = true) @Valid @RequestBody SeguradoType body);

	@ApiOperation(value = "Consultar segurado", nickname = "consultarSegurados", notes = "Consultar segurado por cpf", response = SeguradoType.class, responseContainer = "List", tags = {
			"segurado", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = SeguradoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Segurado not found") })
	@RequestMapping(value = "/segurado", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<SeguradoType>> consultarSegurados();

	@ApiOperation(value = "Deletar segurado", nickname = "deletarSegurado", notes = "Deletar segurado por id", response = SeguradoType.class, tags = {
			"segurado", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = SeguradoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Segurado not found") })
	@RequestMapping(value = "/segurado/{idSegurado}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deletarSegurado(
			@ApiParam(value = "Id do segurado", required = true) @PathVariable("idSegurado") Integer idSegurado);

	@ApiOperation(value = "Salvar Segurado", nickname = "salvar", notes = "Salvar segurado no banco de dados", response = SeguradoType.class, tags = {
			"segurado", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = SeguradoType.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Segurado not found") })
	@RequestMapping(value = "/segurado", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<SeguradoType> salvar(@ApiParam(value = "") @Valid @RequestBody SeguradoType body);

}
