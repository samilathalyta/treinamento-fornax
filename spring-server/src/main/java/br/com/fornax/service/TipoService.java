package br.com.fornax.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import br.com.fornax.entity.TipoEntity;
import br.com.fornax.repository.TipoRepository;
import br.com.fornax.type.TipoType;

public class TipoService {
	@Autowired
	private TipoRepository tipoRepository;
	
	public List<TipoType> consultar() {
		List <TipoType> listaRetorno = new ArrayList<>();
		Iterable<TipoEntity> lista = tipoRepository.findAll();
		for(TipoEntity tipoEntity : lista) {
			TipoType retorno = new TipoType();
					retorno.setDescricao(tipoEntity.getDescricao());
					listaRetorno.add(retorno);
		}
		return listaRetorno;
	}
}
