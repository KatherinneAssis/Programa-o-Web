package sptech.school.exerciciodynamicjpql.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sptech.school.exerciciodynamicjpql.entity.Filme;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class FilmeConsultaDto {

    private Integer id;
    private String titulo;
    private String genero;
    private LocalDate dataLancamento;
    private Double custoProducao;
    private Integer nota;

    public String getAnalise() {
        if (nota < 5){
            return "Flopou!";
        } else if (nota < 8){
            return "Sessão da tarde";
        } else {
            return "Absolute cinema!";
        }
    }
}