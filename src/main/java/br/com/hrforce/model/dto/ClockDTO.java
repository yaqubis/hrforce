package br.com.hrforce.model.dto;

import java.time.LocalDate;
import java.time.LocalTime;

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
public class ClockDTO {

    private Long idClock;

    private Long idEmployee;

    private LocalDate referenceDate;

    private LocalTime firstMark;

    private LocalTime secondMark;

    private LocalTime thirdMark;

    private LocalTime fourthMark;

    private LocalTime fifthMark;

    private LocalTime sixthMark;

}
