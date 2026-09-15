package br.com.hrforce.mapper;

import org.mapstruct.Mapper;

import br.com.hrforce.model.dto.LaborUnionDTO;
import br.com.hrforce.model.entity.LaborUnion;

@Mapper(componentModel = "spring")
public interface LaborUnionMapper {

    LaborUnionDTO toDTO(LaborUnion laborUnion);

    LaborUnion toEntity(LaborUnionDTO laborUnionDTO);

}
