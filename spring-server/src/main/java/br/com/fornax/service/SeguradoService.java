package br.com.fornax.service;

import org.springframework.stereotype.Service;

import br.com.fornax.entity.TipoEntity;
import br.com.fornax.type.SeguradoType;
import br.com.fornax.type.TipoType;



@Service
public class SeguradoService {
	
	public SeguradoType consultar(SeguradoType segurado) {
		
		SeguradoType entidade = new SeguradoType();
		entidade.setNome(segurado.getNome());
		
		SeguradoType cpf = new SeguradoType();
		entidade.setCpf(segurado.getCpf());
		
		SeguradoType email = new SeguradoType();
		entidade.setEmail(segurado.getEmail());
		
	return  segurado;
	}
	
public TipoType consultar(TipoType tipo) {
		
		TipoEntity entidade = new TipoEntity();
			
		entidade.setDescricao(tipo.getDescricao());
		return  tipo;
	}
	
}
