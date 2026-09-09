package br.com.hrforce.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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
public class EmployeeDTO {

    private Long idEmployee;

    private String name;

    private LocalDate birthDate;

    private LocalDate onboardingDate;

    private Boolean temporary;

    private String documentType;

    private String documentNumber;

    private String ctpsNumber;

    private BigDecimal grossSalary;

    private Long idRole;

    private Boolean unionContribution;

}
