package br.com.hrforce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.hrforce.model.dto.EmployeeDTO;
import br.com.hrforce.model.entity.Employee;
import br.com.hrforce.model.entity.Role;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "idRole", source = "role.idRole")
    EmployeeDTO toDTO(Employee employee);

    @Mapping(target = "role", source = "idRole")
    Employee toEntity(EmployeeDTO employeeDTO);

    default Role mapRole(Long idRole) {
        if (idRole == null) {
            return null;
        }
        return Role.builder().idRole(idRole).build();
    }

}
