package br.com.hrforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hrforce.model.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
