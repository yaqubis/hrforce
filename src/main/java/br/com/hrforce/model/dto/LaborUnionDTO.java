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
public class LaborUnionDTO {

    private Long idUnion;

    private String name;

    private String type;

    private String scope;

    private String phone;

    private String email;

    private String pixType;

    private String pixCode;

}
