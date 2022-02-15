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

import br.com.fornax.samila.service.SeguroService;
import br.com.fornax.samila.type.SeguroType;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T18:39:32.283Z")

@Controller
public class SeguroApiController implements SeguroApi {

	private static final Logger log = LoggerFactory.getLogger(SeguroApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private SeguroService seguroService;

	@org.springframework.beans.factory.annotation.Autowired
	public SeguroApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<SeguroType> atualizarSeguros(
			@ApiParam(value = "", required = true) @Valid @RequestBody SeguroType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguroType>(seguroService.atualizar(body), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<SeguroType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
//
		return new ResponseEntity<SeguroType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<SeguroType> consultarPorProposta(Integer proposta) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguroType>(seguroService.consultarPorProposta(proposta), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<SeguroType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguroType>(HttpStatus.NOT_ACCEPTABLE);
	}

	public ResponseEntity<List<SeguroType>> consultarTodos() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<SeguroType>>(seguroService.consultarTodos(), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<List<SeguroType>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<SeguroType>>(HttpStatus.NOT_ACCEPTABLE);
	}

	public ResponseEntity<Void> deletarSeguros(
			@ApiParam(value = "Id do seguro", required = true) @PathVariable("idSeguro") Integer idSeguro) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				seguroService.deletar(idSeguro);
				return new ResponseEntity<Void>(HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<SeguroType> salvarSeguros(@ApiParam(value = "") @Valid @RequestBody SeguroType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguroType>(seguroService.salvar(body), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<SeguroType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguroType>(HttpStatus.BAD_REQUEST);
	}

	

	

	
}
