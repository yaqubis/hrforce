package br.com.hrforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hrforce.model.entity.Clock;

@Repository
public interface ClockRepository extends JpaRepository<Clock, Long> {

}
