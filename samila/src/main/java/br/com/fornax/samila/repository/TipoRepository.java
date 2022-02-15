package br.com.fornax.samila.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fornax.samila.entity.SeguroEntity;
import br.com.fornax.samila.entity.TipoEntity;

@Repository
public interface TipoRepository  extends CrudRepository <TipoEntity, Integer> {

}
