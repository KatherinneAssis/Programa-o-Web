package sptech.school.exerciciodynamicjpql.dto;

import sptech.school.exerciciodynamicjpql.entity.Filme;

import java.util.List;
import java.util.stream.Collectors;

public class FilmeMapper {

    public static FilmeConsultaDto toDto(Filme filme) {
        FilmeConsultaDto filmeConsultaDto = new FilmeConsultaDto();

        filmeConsultaDto.setId(filme.getId());
        filmeConsultaDto.setTitulo(filme.getTitulo());
        filmeConsultaDto.setGenero(filme.getGenero());
        filmeConsultaDto.setDataLancamento(filme.getDataLancamento());
        filmeConsultaDto.setCustoProducao(filme.getCustoProducao());
        filmeConsultaDto.setNota(filme.getNota());
        filmeConsultaDto.getAnalise(filme);

        return filmeConsultaDto;
    }

    public static List<FilmeConsultaDto> toDto(List<Filme> entities) {
        List<FilmeConsultaDto> filmeConsultaDtos = entities
                .stream()
                .map(FilmeMapper::toDto)
                .collect(Collectors.toList());

        return filmeConsultaDtos;
    }

    public static Filme toEntity(FilmeCriacaoDto dto) {
        Filme filme = new Filme();

        filme.setTitulo(dto.getTitulo());
        filme.setGenero(dto.getGenero());
        filme.setDataLancamento(dto.getDataLancamento());
        filme.setCustoProducao(dto.getCustoProducao());
        filme.setNota(dto.getNota());

        return filme;
    }
}
