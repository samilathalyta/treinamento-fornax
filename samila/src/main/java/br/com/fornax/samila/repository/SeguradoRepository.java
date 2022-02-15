package br.com.fornax.samila.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

import br.com.fornax.samila.entity.SeguradoEntity;

@Repository
public interface SeguradoRepository extends CrudRepository<SeguradoEntity, Integer> {

	@Query("Select segurado FROM SeguradoEntity segurado " + "JOIN segurado.seguros seguro Where seguro.proposta = ?1")
	Optional<SeguradoEntity> findByProposta(Integer proposta);

	

	
}
