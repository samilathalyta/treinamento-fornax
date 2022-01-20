package br.com.fornax.thalyta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fornax.thalyta.entity.SeguradoEntity;
import br.com.fornax.thalyta.repository.SeguradoRepository;
import br.com.fornax.thalyta.type.SeguradoType;

@Service
public class SeguradoService {

	@Autowired
	private static SeguradoRepository seguradoRepository;

	public static List<SeguradoType> consultar() {
		List<SeguradoType> listaRetorno = new ArrayList<>();
		Iterable<SeguradoEntity> lista = seguradoRepository.findAll();
		for (SeguradoEntity seguradoEntity : lista) {
			SeguradoType retorno = new SeguradoType();
			retorno.setNome(seguradoEntity.getNome());
			retorno.setCpf(seguradoEntity.getCpf());
			retorno.setEmail(seguradoEntity.getEmail());
			listaRetorno.add(retorno);
		}
		return listaRetorno;
	}

}
