package br.com.hrforce.mapper;

import org.mapstruct.Mapper;

import br.com.hrforce.model.dto.DepartmentDTO;
import br.com.hrforce.model.entity.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentDTO toDTO(Department department);

    Department toEntity(DepartmentDTO departmentDTO);

}
