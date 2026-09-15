package br.com.hrforce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.hrforce.model.dto.RoleDTO;
import br.com.hrforce.model.entity.Department;
import br.com.hrforce.model.entity.LaborUnion;
import br.com.hrforce.model.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "idDepartment", source = "department.idDepartment")
    @Mapping(target = "idUnion", source = "laborUnion.idUnion")
    RoleDTO toDTO(Role role);

    @Mapping(target = "department", source = "idDepartment")
    @Mapping(target = "laborUnion", source = "idUnion")
    Role toEntity(RoleDTO roleDTO);

    default Department mapDepartment(Long idDepartment) {
        if (idDepartment == null) {
            return null;
        }
        return Department.builder().idDepartment(idDepartment).build();
    }

    default LaborUnion mapLaborUnion(Long idUnion) {
        if (idUnion == null) {
            return null;
        }
        return LaborUnion.builder().idUnion(idUnion).build();
    }

}
