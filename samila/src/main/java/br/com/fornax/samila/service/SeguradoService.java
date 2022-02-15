package br.com.fornax.samila.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import br.com.fornax.samila.entity.SeguradoEntity;
import br.com.fornax.samila.entity.TelefoneEntity;
import br.com.fornax.samila.repository.SeguradoRepository;
import br.com.fornax.samila.type.SeguradoType;
import br.com.fornax.samila.type.TelefoneType;

@Service
public class SeguradoService {

	@Autowired
	private SeguradoRepository seguradoRepository;

	public SeguradoType consultarSeguradoPorProposta(Integer proposta) {

		Optional<SeguradoEntity> retorno = seguradoRepository.findByProposta(proposta);

		if (retorno.isPresent()) {

			SeguradoType seguradoType = new SeguradoType();
			seguradoType.setIdSegurado(retorno.get().getIdSegurado());
			seguradoType.setNome(retorno.get().getNome());
			seguradoType.setCpf(retorno.get().getCpf());
			seguradoType.setEmail(retorno.get().getEmail());

			 seguradoType.setTelefones(new ArrayList<TelefoneType>());
			for (TelefoneEntity telefone : retorno.get().getTelefones()) {
				TelefoneType telefoneType = new TelefoneType();
				telefoneType.setIdTelefone(telefone.getIdTelefone());
				telefoneType.setDdd(telefone.getDdd());
				telefoneType.setNumero(telefone.getNumero());
				
				seguradoType.getTelefones().add(telefoneType);
				//seguradoType.addTelefonesItem(telefoneType); 
			}
			return seguradoType;

		} else {
			return null;
		}

	}

	/*
	 * public SeguradoType findByProposta(Integer proposta) { // TODO Auto-generated
	 * method stub return null; }
	 */

	public List<SeguradoType> consultarSegurados() {

		List<SeguradoType> listaRetorno = new ArrayList<>();

		Iterable<SeguradoEntity> lista = seguradoRepository.findAll();

		for (SeguradoEntity seguradoEntity : lista) {
			SeguradoType seguradoType = new SeguradoType();
			seguradoType.setIdSegurado(seguradoEntity.getIdSegurado());
			seguradoType.setNome(seguradoEntity.getNome());
			seguradoType.setCpf(seguradoEntity.getCpf());
			seguradoType.setEmail(seguradoEntity.getEmail());
			listaRetorno.add(seguradoType);

			
		}
		return listaRetorno;
	}
		


	public SeguradoType salvar(SeguradoType entrada) throws Exception {

		SeguradoEntity salvarObj = new SeguradoEntity();

		salvarObj.setIdSegurado(entrada.getIdSegurado());
		salvarObj.setNome(entrada.getNome());
		salvarObj.setCpf(entrada.getCpf());
		salvarObj.setEmail(entrada.getEmail());

		if (seguradoRepository.findById(entrada.getIdSegurado()).isPresent())
			throw new Exception("Usuário já existe!");

		seguradoRepository.save(salvarObj);

		return entrada;

	}

	public SeguradoType atualizar(SeguradoType entrada) {

		SeguradoEntity atualizarObj = new SeguradoEntity();
		atualizarObj.setIdSegurado(entrada.getIdSegurado());
		atualizarObj.setNome(entrada.getNome());
		atualizarObj.setCpf(entrada.getCpf());
		atualizarObj.setEmail(entrada.getEmail());

		seguradoRepository.save(atualizarObj);

		return entrada;
	}

	public void deletarSegurado(Integer id) {
		seguradoRepository.deleteById(id);
	}

}
