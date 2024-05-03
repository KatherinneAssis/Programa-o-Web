package sptech.school.exerciciodynamicjpql.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.exerciciodynamicjpql.dto.FilmeConsultaDto;
import sptech.school.exerciciodynamicjpql.dto.FilmeCriacaoDto;
import sptech.school.exerciciodynamicjpql.entity.Filme;
import sptech.school.exerciciodynamicjpql.repository.FilmeRepository;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filmes")
public class FilmeController {
    private final FilmeRepository repository;
    private final ModelMapper mapper;

    //1.
    @GetMapping("/titulo")
    public ResponseEntity<List<FilmeConsultaDto>> buscarFilmePorTitulo(@RequestParam String nome) {
        List<Filme> filmes = repository.findByTituloContainsIgnoreCase(nome);

        return filmes.isEmpty()
                ? status(204).build()
                : status(200).body(mapper.map(filmes,
                    new TypeToken<List<FilmeConsultaDto>>(){}.getType())
                 );
    }




    //2.
    @PostMapping
    public ResponseEntity<FilmeConsultaDto> criarFilme(@RequestBody @Valid FilmeCriacaoDto filme) {
        return status(201).body(mapper.map(repository.save(mapper.map(filme, Filme.class)), FilmeConsultaDto.class));
    }



    //3.
    @GetMapping("/data")
    public ResponseEntity<List<FilmeConsultaDto>> buscarFilmeEntreDatas(
            @RequestParam LocalDate dataInicio,
            @RequestParam LocalDate dataFim
    ) {
        List<Filme> filmes = repository.findByDataLancamentoBetween(dataInicio, dataFim);
        return filmes.isEmpty()
                ? status(204).build()
                : status(200).body(mapper.map(filmes,
                    new TypeToken<List<FilmeConsultaDto>>(){}.getType())
                 );
    }




    //4.
    @GetMapping("/menor-custo")
    public ResponseEntity<FilmeConsultaDto> buscarFilmeMaisBarato() {
        Filme filme = repository.findTopByOrderByCustoProducaoAsc();

        if (filme == null){
            return status(404).build();
        }

        FilmeConsultaDto dto = mapper.map(filme, FilmeConsultaDto.class);

        return status(200).body(dto);
    }
}