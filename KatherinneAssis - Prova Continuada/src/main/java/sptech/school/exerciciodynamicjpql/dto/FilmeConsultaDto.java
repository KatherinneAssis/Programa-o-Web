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
    private String analise;

    public String getAnalise(Filme filme) {
        if (filme.getNota() < 5){
            analise = "Flopou!";
        } else if (filme.getNota() < 8){
            analise = "Sessão da tarde";
        } else {
            analise = "Absolute cinema!";
        }

        return analise;
    }
}