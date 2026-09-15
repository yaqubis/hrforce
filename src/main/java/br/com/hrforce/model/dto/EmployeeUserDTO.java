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
public class EmployeeUserDTO {

    private Long idEmployeeUser;

    private Long idEmployee;

    private String username;

    @ToString.Exclude
    private String password;

}
