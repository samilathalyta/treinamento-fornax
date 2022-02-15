package br.com.fornax.samila.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fornax.samila.entity.TelefoneEntity;

@Repository
public interface TelefoneRepository extends CrudRepository <TelefoneEntity, Integer>{

		
}
