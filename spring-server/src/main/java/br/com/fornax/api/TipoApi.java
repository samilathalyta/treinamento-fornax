package br.com.fornax.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import br.com.fornax.type.SeguroType;
import br.com.fornax.type.TipoType;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T17:08:57.672Z")

@Validated
@Api(value = "tipo", description = "the tipo API")
@RequestMapping(value = "/v1")
public interface TipoApi {

    @ApiOperation(value = "Atualizar tipo", nickname = "atualizarTipo", notes = "Atualizar tipo no banco de dados", response = SeguroType.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessful operation", response = SeguroType.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<SeguroType> atualizarTipo(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body);


    @ApiOperation(value = "Consultar tipo", nickname = "consultarTipo", notes = "Consultar tipo", response = TipoType.class, responseContainer = "List", tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<TipoType>> consultarTipo(@ApiParam(value = "" ) @Valid @RequestBody TipoType body);


    @ApiOperation(value = "Deletar tipo", nickname = "deletarTipo", notes = "Deletar tipo por por Id", response = TipoType.class, tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo/{idTipo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<TipoType> deletarTipo(@ApiParam(value = "Id do tipo",required=true) @PathVariable("idTipo") Integer tipo);


    @ApiOperation(value = "Salvar tipo", nickname = "salvarTipo", notes = "Salvar tipo no banco de dados", response = TipoType.class, responseContainer = "List", tags={ "tipo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessful operation", response = TipoType.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tipo not found") })
    @RequestMapping(value = "/tipo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TipoType> salvarTipo(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body);

}