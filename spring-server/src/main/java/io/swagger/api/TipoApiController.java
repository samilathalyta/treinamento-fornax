package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Seguro;
import io.swagger.model.Tipo;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Controller
public class TipoApiController implements TipoApi{

	 private static final Logger log = LoggerFactory.getLogger(TipoApiController.class);

	    private final ObjectMapper objectMapper;

	    private final HttpServletRequest request;

	    @org.springframework.beans.factory.annotation.Autowired
	    public TipoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
	        this.objectMapper = objectMapper;
	        this.request = request;
	    }

	    public ResponseEntity<Seguro> atualizarTipo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Seguro body) {
	        String accept = request.getHeader("Accept");
	        if (accept != null && accept.contains("application/json")) {
	            try {
	                return new ResponseEntity<Seguro>(objectMapper.readValue("{\"empty\": false}", Seguro.class), HttpStatus.NOT_IMPLEMENTED);
	            } catch (IOException e) {
	                log.error("Couldn't serialize response for content type application/json", e);
	                return new ResponseEntity<Seguro>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }
	//
	        return new ResponseEntity<Seguro>(HttpStatus.NOT_IMPLEMENTED);
	    }

	    public ResponseEntity<Seguro> consultarTipo(@ApiParam(value = "Tipo do seguro",required=true) @PathVariable("tipo") Integer tipo) {
	        String accept = request.getHeader("Accept");
	        if (accept != null && accept.contains("application/json")) {
	            try {
	                return new ResponseEntity<Seguro>(objectMapper.readValue("{\"empty\": false}", Seguro.class), HttpStatus.NOT_IMPLEMENTED);
	            } catch (IOException e) {
	                log.error("Couldn't serialize response for content type application/json", e);
	                return new ResponseEntity<Seguro>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }

	        return new ResponseEntity<Seguro>(HttpStatus.NOT_IMPLEMENTED);
	    }

	    public ResponseEntity<Seguro> deletarTipo(@ApiParam(value = "id do tipo" ,required=true) @RequestHeader(value="tipo", required=true) Integer tipo) {
	        String accept = request.getHeader("Accept");
	        if (accept != null && accept.contains("application/json")) {
	            try {
	                return new ResponseEntity<Seguro>(objectMapper.readValue("{\"empty\": false}", Seguro.class), HttpStatus.NOT_IMPLEMENTED);
	            } catch (IOException e) {
	                log.error("Couldn't serialize response for content type application/json", e);
	                return new ResponseEntity<Seguro>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }

	        return new ResponseEntity<Seguro>(HttpStatus.NOT_IMPLEMENTED);
	    }

	    public ResponseEntity<Seguro> salvarTipoo(@ApiParam(value = ""  )  @Valid @RequestBody Tipo body) {
	        String accept = request.getHeader("Accept");
	        if (accept != null && accept.contains("application/json")) {
	            try {
	                return new ResponseEntity<Seguro>(objectMapper.readValue("{\"empty\": false}", Seguro.class), HttpStatus.NOT_IMPLEMENTED);
	            } catch (IOException e) {
	                log.error("Couldn't serialize response for content type application/json", e);
	                return new ResponseEntity<Seguro>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }

	        return new ResponseEntity<Seguro>(HttpStatus.NOT_IMPLEMENTED);
	    }

		

}
