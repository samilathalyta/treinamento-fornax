package br.com.fornax.samila.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

import br.com.fornax.samila.entity.SeguroEntity;

@Repository
public interface SeguroRepository extends CrudRepository <SeguroEntity, Integer>{

		@Query("SELECT seguro FROM SeguroEntity seguro WHERE seguro.proposta = ?1") //selecionar tudo de seguro onde proposta é = 1
		Optional<SeguroEntity> findByProposta (Integer proposta);
}
