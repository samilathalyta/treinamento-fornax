package br.com.fornax.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fornax.service.TipoService;
import br.com.fornax.type.SeguroType;
import br.com.fornax.type.TipoType;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T17:08:57.672Z")

@Controller
public class TipoApiController implements TipoApi {

    private static final Logger log = LoggerFactory.getLogger(TipoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    private TipoService tipoService;
    

    @org.springframework.beans.factory.annotation.Autowired
    public TipoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SeguroType> atualizarTipo(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SeguroType>(objectMapper.readValue("{\"empty\": false}", SeguroType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SeguroType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SeguroType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TipoType>> consultarTipo(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	return new ResponseEntity<List<TipoType>>(tipoService.consultar(), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TipoType>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TipoType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TipoType> deletarTipo(@ApiParam(value = "Id do tipo",required=true) @PathVariable("idTipo") Integer idTipo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TipoType>(objectMapper.readValue("{\"empty\": false}", TipoType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TipoType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TipoType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TipoType> salvarTipo(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TipoType>(objectMapper.readValue("{\"empty\": false}", TipoType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TipoType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TipoType>(HttpStatus.NOT_IMPLEMENTED);
    }

}