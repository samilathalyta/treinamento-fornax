package io.swagger.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Seguro;
import io.swagger.model.Tipo;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Validated
@Api(value = "tipo", description = "the tipo API")
@RequestMapping(value = "/treinamento/v1")
public interface TipoApi {

	@ApiOperation(value = "Atualizar tipo", nickname = "atualizarTipo", notes = "Atualizar tipo no banco de dados", response = Tipo.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Tipo.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Tipo> atualizarTipo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Tipo body);


    @ApiOperation(value = "Consultar tipo", nickname = "consultarTipo", notes = "Consultar tipo ", response = Tipo.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Tipo.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Seguro> consultarTipo(@ApiParam(value = "Tipo de seguro",required=true) @PathVariable("id") Integer proposta);


    @ApiOperation(value = "Deletar tipo", nickname = "deletarTipo", notes = "Deletar tipo por id", response = Tipo.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Tipo.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/seguro",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Seguro> deletarTipo(@ApiParam(value = "id do tipo" ,required=true) @RequestHeader(value="tipo", required=true) Integer id);


    @ApiOperation(value = "Salvar tipo", nickname = "salvarTipo", notes = "Salvar tipo no banco de dados", response = Tipo.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Tipo.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Tipo> salvarTipo(@ApiParam(value = ""  )  @Valid @RequestBody Tipo body);

}
	

