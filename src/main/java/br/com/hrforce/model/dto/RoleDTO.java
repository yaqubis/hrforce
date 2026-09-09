package br.com.hrforce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleDTO {

    private Long idRole;

    private String name;

    private String cbo;

    private Long idDepartment;

    private Long idUnion;

}
