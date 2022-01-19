package br.com.fornax.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fornax.entity.TipoEntity;

@Repository
public interface TipoRepository extends CrudRepository<TipoEntity, Integer>{

}
