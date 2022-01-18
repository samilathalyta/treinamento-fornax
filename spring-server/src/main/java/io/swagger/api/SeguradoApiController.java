package io.swagger.api;

import io.swagger.model.Segurado;
import io.swagger.model.Telefone;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class SeguradoApiController implements SeguradoApi {

    private static final Logger log = LoggerFactory.getLogger(SeguradoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
//
    @org.springframework.beans.factory.annotation.Autowired
    public SeguradoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Segurado> atualizar(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Segurado body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Segurado>(objectMapper.readValue("{\"empty\": false}", Segurado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Segurado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Segurado>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Segurado> consultar(@ApiParam(value = "cpf do segurado",required=true) @PathVariable("cpf") Integer cpf) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Segurado>(objectMapper.readValue("{\"empty\": false}", Segurado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Segurado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Segurado>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Segurado> deletar(@ApiParam(value = "cpf do segurado" ,required=true) @RequestHeader(value="idSeguro", required=true) Integer idSeguro) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Segurado>(objectMapper.readValue("{\"empty\": false}", Segurado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Segurado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Segurado>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Segurado> salvar(@ApiParam(value = ""  )  @Valid @RequestBody Telefone body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Segurado>(objectMapper.readValue("{\"empty\": false}", Segurado.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Segurado>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Segurado>(HttpStatus.NOT_IMPLEMENTED);
    }

}
