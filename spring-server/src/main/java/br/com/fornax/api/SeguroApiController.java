package br.com.fornax.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fornax.type.TipoType;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Controller
public class SeguroApiController implements SeguroApi {

    private static final Logger log = LoggerFactory.getLogger(SeguroApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SeguroApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TipoType> atualizarSeguro(@ApiParam(value = "" ,required=true )  @Valid @RequestBody TipoType body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TipoType>(objectMapper.readValue("{\"empty\": false}", TipoType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TipoType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
//
        return new ResponseEntity<TipoType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TipoType> consultarSeguro(@ApiParam(value = "Porposta do seguro",required=true) @PathVariable("proposta") Integer proposta) {
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

    public ResponseEntity<TipoType> deletarSeguro(@ApiParam(value = "cpf do segurado" ,required=true) @RequestHeader(value="proposta", required=true) Integer proposta) {
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

    public ResponseEntity<TipoType> salvarSeguro(@ApiParam(value = ""  )  @Valid @RequestBody TipoType body) {
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
