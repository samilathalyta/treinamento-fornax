package br.com.fornax.samila.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;


import br.com.fornax.samila.entity.SeguroEntity;
import br.com.fornax.samila.repository.SeguroRepository;

import br.com.fornax.samila.type.SeguroType;

@Service
public class SeguroService {

	@Autowired
	private SeguroRepository seguroRepository;

	public SeguroType consultarPorProposta(Integer proposta) {

		Optional<SeguroEntity> retorno = seguroRepository.findByProposta(proposta);

		if (retorno.isPresent()) {

			SeguroType seguroType = new SeguroType();
			seguroType.setIdSeguro(retorno.get().getIdSeguro());
			seguroType.setProposta(retorno.get().getProposta());
			seguroType.setApolice(retorno.get().getApolice());

			return seguroType;

		} else {
			return null;
		}
	}

	public List<SeguroType> consultarTodos() {

		List<SeguroType> listaRetorno = new ArrayList<>();

		Iterable<SeguroEntity> lista = seguroRepository.findAll();

		for (SeguroEntity seguroEntity : lista) {
			SeguroType seguroType = new SeguroType();

			seguroType.setIdSeguro(seguroEntity.getIdSeguro());
			seguroType.setApolice(seguroEntity.getApolice());
			seguroType.setProposta(seguroEntity.getProposta());
			listaRetorno.add(seguroType);

			/*
			 * SeguradoType seguradoType = new SeguradoType();
			 * seguradoType.setCpf(seguroEntity.getSegurado().getCpf());
			 * seguradoType.setEmail(seguroEntity.getSegurado().getEmail());
			 * seguradoType.setNome(seguroEntity.getSegurado().getNome());
			 * seguradoType.setIdSegurado(seguroEntity.getSegurado().getIdSegurado());
			 * 
			 * seguroType.setSegurado(seguradoType);
			 */

		}
		return listaRetorno;

	}

	public SeguroType salvar(SeguroType entrada) throws Exception {

		SeguroEntity salvarObj = new SeguroEntity();

		salvarObj.setIdSeguro(entrada.getIdSeguro());
		salvarObj.setApolice(entrada.getApolice());
		salvarObj.setProposta(entrada.getProposta());

		/*salvarObj.setSegurado(new ArrayList<SeguradoType>());
		SeguradoEntity segurado = SeguradoEntity();
		SeguradoType seguradoType = new SeguradoType();
		seguradoType.setIdSegurado(segurado.getIdSegurado());
		seguradoType.setNome(segurado.getNome());
		seguradoType.setCpf(segurado.getCpf());
		seguradoType.setEmail(segurado.getEmail());*/

		//salvarObj.getSegurado().add(seguradoType);

		if (seguroRepository.findById(entrada.getIdSeguro()).isPresent())
			throw new Exception("Objeto existente!");

		seguroRepository.save(salvarObj);

		return entrada;

	}

	public SeguroType atualizar(SeguroType entrada) {

		SeguroEntity salvarObj = new SeguroEntity();

		salvarObj.setIdSeguro(entrada.getIdSeguro());
		salvarObj.setApolice(entrada.getApolice());
		salvarObj.setProposta(entrada.getProposta());

		/*
		*/

		seguroRepository.save(salvarObj);
		// SeguroType.getSegurado().add(seguradoType);

		return entrada;
	}

	public void deletar(Integer id) {
		seguroRepository.deleteById(id);
	}

	

}
