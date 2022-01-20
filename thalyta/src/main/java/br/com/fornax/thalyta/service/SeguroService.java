package br.com.fornax.thalyta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fornax.thalyta.entity.SeguroEntity;
import br.com.fornax.thalyta.repository.SeguroRepository;
import br.com.fornax.thalyta.type.SeguroType;

public class SeguroService {

	@Autowired	
	private SeguroRepository seguroRepository;
	
	public List<SeguroType> consultar() {
		List <SeguroType> listaRetorno = new ArrayList<>();
		Iterable<SeguroEntity> lista = seguroRepository.findAll();
		for(SeguroEntity SeguroEntity : lista) {
			SeguroType retorno = new SeguroType();
					retorno.setProposta(SeguroEntity.getProposta());
					retorno.setApolice(SeguroEntity.getApolice());
					retorno.setProposta(SeguroEntity.getProposta());
					listaRetorno.add(retorno);
		}
		return listaRetorno;
	}
}
