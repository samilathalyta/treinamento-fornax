package br.com.fornax.thalyta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fornax.thalyta.entity.SeguradoEntity;

@Repository
public interface SeguradoRepository extends CrudRepository<SeguradoEntity, Integer>{

}
