package br.com.fornax.thalyta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fornax.thalyta.entity.TipoEntity;

@Repository

public interface TipoRepository extends CrudRepository<TipoEntity, Integer> {

}
