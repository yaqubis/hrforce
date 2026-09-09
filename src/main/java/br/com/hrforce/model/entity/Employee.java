package br.com.hrforce.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "onboarding_date", nullable = false)
    private LocalDate onboardingDate;

    @Builder.Default
    @Column(name = "temporary")
    private Boolean temporary = false;

    @Column(name = "document_type", nullable = false, length = 30)
    private String documentType;

    @Column(name = "document_number", nullable = false, length = 25)
    private String documentNumber;

    @Column(name = "ctps_number", length = 20)
    private String ctpsNumber;

    @Column(name = "gross_salary", nullable = false, precision = 6, scale = 2)
    private BigDecimal grossSalary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;

    @Builder.Default
    @Column(name = "union_contribution")
    private Boolean unionContribution = true;

}
