package br.com.hrforce.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name = "clock")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Clock {

    @Id
    @Column(name = "id_clock", nullable = false)
    private Long idClock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false)
    @ToString.Exclude
    private Employee employee;

    @Column(name = "reference_date", nullable = false)
    private LocalDate referenceDate;

    @Column(name = "first_mark")
    private LocalTime firstMark;

    @Column(name = "second_mark")
    private LocalTime secondMark;

    @Column(name = "third_mark")
    private LocalTime thirdMark;

    @Column(name = "fourth_mark")
    private LocalTime fourthMark;

    @Column(name = "fifth_mark")
    private LocalTime fifthMark;

    @Column(name = "sixth_mark")
    private LocalTime sixthMark;

}
