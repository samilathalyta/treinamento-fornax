package br.com.fornax.samila.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fornax.samila.service.SeguradoService;
import br.com.fornax.samila.type.SeguradoType;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Controller
public class SeguradoApiController implements SeguradoApi {

	private static final Logger log = LoggerFactory.getLogger(SeguradoApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private SeguradoService seguradoService;

//
	@org.springframework.beans.factory.annotation.Autowired
	public SeguradoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<SeguradoType> atualizar(
			@ApiParam(value = "", required = true) @Valid @RequestBody SeguradoType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguradoType>(seguradoService.atualizar(body), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<SeguradoType>> consultarSegurados() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<SeguradoType>>(seguradoService.consultarSegurados(), HttpStatus.OK);
			} catch (Exception e) {
				log.error("A aplicação deu errado!", e);
				return new ResponseEntity<List<SeguradoType>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<SeguradoType>>(HttpStatus.NOT_ACCEPTABLE);
	}

	public ResponseEntity<SeguradoType> consultarSeguradoPorProposta(Integer proposta) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguradoType>(seguradoService.consultarSeguradoPorProposta(proposta), HttpStatus.OK);
			} catch (Exception e) {
				log.error("A aplicação deu errado!", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.NOT_ACCEPTABLE);
	}

	
	public ResponseEntity<Void> deletarSegurado(
			@ApiParam(value = "Id do segurado", required = true) @PathVariable("idSegurado") Integer idSegurado) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {

				seguradoService.deletarSegurado(idSegurado);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<SeguradoType> salvar(@ApiParam(value = "") @Valid @RequestBody SeguradoType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {

				return new ResponseEntity<SeguradoType>(seguradoService.salvar(body), HttpStatus.OK);

			} catch (Exception e) {
				log.error("Erro na aplicação", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.BAD_REQUEST);
	}

	


}
