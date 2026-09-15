package br.com.hrforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hrforce.model.entity.LaborUnion;

@Repository
public interface LaborUnionRepository extends JpaRepository<LaborUnion, Long> {

}
