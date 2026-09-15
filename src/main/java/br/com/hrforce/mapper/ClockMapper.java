package br.com.hrforce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.hrforce.model.dto.ClockDTO;
import br.com.hrforce.model.entity.Clock;
import br.com.hrforce.model.entity.Employee;

@Mapper(componentModel = "spring")
public interface ClockMapper {

    @Mapping(target = "idEmployee", source = "employee.idEmployee")
    ClockDTO toDTO(Clock clock);

    @Mapping(target = "employee", source = "idEmployee")
    Clock toEntity(ClockDTO clockDTO);

    default Employee mapEmployee(Long idEmployee) {
        if (idEmployee == null) {
            return null;
        }
        return Employee.builder().idEmployee(idEmployee).build();
    }

}
