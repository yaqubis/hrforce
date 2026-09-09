package br.com.hrforce.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "labor_union")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LaborUnion {

    @Id
    @Column(name = "id_union", nullable = false)
    private Long idUnion;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "type", nullable = false, length = 100)
    private String type;

    @Column(name = "scope", length = 100)
    private String scope;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "pix_type", nullable = false, length = 100)
    private String pixType;

    @Column(name = "pix_code", nullable = false, length = 100)
    private String pixCode;

}
