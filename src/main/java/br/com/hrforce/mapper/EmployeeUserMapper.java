package br.com.hrforce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.hrforce.model.dto.EmployeeUserDTO;
import br.com.hrforce.model.entity.Employee;
import br.com.hrforce.model.entity.EmployeeUser;

@Mapper(componentModel = "spring")
public interface EmployeeUserMapper {

    @Mapping(target = "idEmployee", source = "employee.idEmployee")
    EmployeeUserDTO toDTO(EmployeeUser employeeUser);

    @Mapping(target = "employee", source = "idEmployee")
    EmployeeUser toEntity(EmployeeUserDTO employeeUserDTO);

    default Employee mapEmployee(Long idEmployee) {
        if (idEmployee == null) {
            return null;
        }
        return Employee.builder().idEmployee(idEmployee).build();
    }

}
