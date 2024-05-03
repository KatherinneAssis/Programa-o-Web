package sptech.school.exerciciodynamicjpql.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class FilmeCriacaoDto {

    @NotBlank
    private String titulo;

    @NotBlank
    private String genero;

    @NotNull @PastOrPresent
    private LocalDate dataLancamento;

    @NotNull @DecimalMin("20000000.50")
    private Double custoProducao;

    @NotNull @Min(1) @Max(10)
    private Integer nota;
}
