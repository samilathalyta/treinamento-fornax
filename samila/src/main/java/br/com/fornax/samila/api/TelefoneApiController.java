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

import br.com.fornax.samila.service.TelefoneService;
import br.com.fornax.samila.type.TelefoneType;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-18T17:08:57.672Z")

@Controller
public class TelefoneApiController implements TelefoneApi {

	private static final Logger log = LoggerFactory.getLogger(TelefoneApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	@Autowired
	private TelefoneService telefoneService;

	@org.springframework.beans.factory.annotation.Autowired
	public TelefoneApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<TelefoneType> atualizar(@ApiParam(value = "") @Valid @RequestBody TelefoneType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<TelefoneType>(telefoneService.atualizar(body), HttpStatus.OK);

			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<TelefoneType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<TelefoneType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<TelefoneType>> consultar() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<TelefoneType>>(telefoneService.consultar(), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Erro na aplicação!", e);
				return new ResponseEntity<List<TelefoneType>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<TelefoneType>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> deletar(
			@ApiParam(value = "Id do telefone", required = true) @PathVariable("idTelefone") Integer idTelefone) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {

				telefoneService.deletar(idTelefone);

				return new ResponseEntity<Void>(HttpStatus.OK);

			} catch (Exception e) {
				log.error("Erro na aplicação", e);
				return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<TelefoneType> salvar(@ApiParam(value = "") @Valid @RequestBody TelefoneType body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<TelefoneType>(telefoneService.salvar(body), HttpStatus.OK);

			} catch (Exception e) {
				log.error("Erro na aplicação", e);
				return new ResponseEntity<TelefoneType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} else {
			return new ResponseEntity<TelefoneType>(HttpStatus.BAD_REQUEST);
		}

	}

	

	

}