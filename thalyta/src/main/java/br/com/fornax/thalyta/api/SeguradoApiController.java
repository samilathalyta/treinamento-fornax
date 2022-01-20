package br.com.fornax.thalyta.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fornax.thalyta.service.SeguradoService;
import br.com.fornax.thalyta.type.SeguradoType;
import br.com.fornax.thalyta.type.TelefoneType;
import br.com.fornax.thalyta.type.TipoType;
import io.swagger.annotations.ApiParam;

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

	public ResponseEntity<SeguradoType> atualizar(
			@ApiParam(value = "", required = true) @Valid @RequestBody SeguradoType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguradoType>(
						objectMapper.readValue("{\"empty\": false}", SeguradoType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<SeguradoType>> consultarTipo(@ApiParam(value = "") @Valid @RequestBody TipoType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<SeguradoType>>(SeguradoService.consultar(), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<SeguradoType>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<SeguradoType>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<SeguradoType> deletar(
			@ApiParam(value = "cpf do segurado", required = true) @RequestHeader(value = "idSeguro", required = true) Integer idSeguro) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguradoType>(
						objectMapper.readValue("{\"empty\": false}", SeguradoType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<SeguradoType> salvar(@ApiParam(value = "") @Valid @RequestBody TelefoneType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<SeguradoType>(
						objectMapper.readValue("{\"empty\": false}", SeguradoType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<SeguradoType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<SeguradoType>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<List<SeguradoType>> consultar(Integer cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
