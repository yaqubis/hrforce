package br.com.hrforce.model.entity;

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
@Table(name = "role")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {

    @Id
    @Column(name = "id_role", nullable = false)
    private Long idRole;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "cbo", nullable = false, length = 255)
    private String cbo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_department", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_union", nullable = false)
    private LaborUnion laborUnion;

}
