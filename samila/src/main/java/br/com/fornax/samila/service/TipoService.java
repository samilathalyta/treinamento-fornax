package br.com.fornax.samila.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fornax.samila.entity.TipoEntity;
import br.com.fornax.samila.repository.TipoRepository;
import br.com.fornax.samila.type.TipoType;

@Service
public class TipoService {
	@Autowired
	private TipoRepository tipoRepository;

	public List<TipoType> consultar() {

		List<TipoType> listaRetorno = new ArrayList<>();
		Iterable<TipoEntity> lista = tipoRepository.findAll();
		
		for (TipoEntity tipoEntity : lista) {
			TipoType retorno = new TipoType();
			retorno.setDescricao(tipoEntity.getDescricao());
			listaRetorno.add(retorno);
		}
		return listaRetorno;
	
	}

	public TipoType salvar(TipoType entrada) throws Exception {

		TipoEntity salvarObj = new TipoEntity();

		salvarObj.setIdTipo(entrada.getIdTipo());
		salvarObj.setDescricao(entrada.getDescricao());

		if (tipoRepository.findById(entrada.getIdTipo()).isPresent())
			throw new Exception("Objeto jpa existe!");

		tipoRepository.save(salvarObj);

		return entrada;
	}

	public TipoType atualizarTipo(TipoType entrada) {

		TipoEntity atualizarObj = new TipoEntity();
		atualizarObj.setIdTipo(entrada.getIdTipo());
		atualizarObj.setDescricao(entrada.getDescricao());

		tipoRepository.save(atualizarObj);

		return entrada;
	}

	public void deletarTipo(Integer id) {
		tipoRepository.deleteById(id);

	}

}