package br.com.fornax.samila.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fornax.samila.entity.TelefoneEntity;
import br.com.fornax.samila.entity.TipoEntity;
import br.com.fornax.samila.repository.TelefoneRepository;
import br.com.fornax.samila.type.TelefoneType;

@Service
public class TelefoneService {
	@Autowired
	private TelefoneRepository telefoneRepository;

	public List<TelefoneType> consultar() {

		List<TelefoneType> listaRetorno = new ArrayList<>();
		Iterable<TelefoneEntity> lista = telefoneRepository.findAll();
		
		for (TelefoneEntity telefone : lista) {
			TelefoneType retorno = new TelefoneType();
			retorno.setIdTelefone(telefone.getIdTelefone());
			retorno.setDdd(telefone.getDdd());
			retorno.setNumero(telefone.getNumero());
			listaRetorno.add(retorno);
		}
		return listaRetorno;
	
	}

	public TelefoneType salvar(TelefoneType entrada) throws Exception {

		TelefoneEntity salvarObj = new TelefoneEntity();

		salvarObj.setIdTelefone(entrada.getIdTelefone());
		salvarObj.setDdd(entrada.getDdd());
		salvarObj.setNumero(entrada.getNumero());

		if (telefoneRepository.findById(entrada.getIdTelefone()).isPresent())
			throw new Exception("Objeto jpa existe!");

		telefoneRepository.save(salvarObj);

		return entrada;
	}

	public TelefoneType atualizar(TelefoneType entrada) {

		TelefoneEntity atualizarObj = new TelefoneEntity();
		atualizarObj.setIdTelefone(entrada.getIdTelefone());
		atualizarObj.setDdd(entrada.getDdd());
		atualizarObj.setNumero(entrada.getNumero());

		telefoneRepository.save(atualizarObj);

		return entrada;
	}

	public void deletar(Integer id) {
		telefoneRepository.deleteById(id);

	}

}