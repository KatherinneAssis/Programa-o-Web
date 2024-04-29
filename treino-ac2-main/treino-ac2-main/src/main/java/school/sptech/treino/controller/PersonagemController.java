package school.sptech.treino.controller;

import org.springframework.http.ResponseEntity;
import school.sptech.treino.dto.PersonagemConsultaDto;
import school.sptech.treino.dto.PersonagemCriacaoDto;

import java.time.LocalDate;
import java.util.List;


public class PersonagemController {

    public ResponseEntity<List<PersonagemConsultaDto>> listagem() {
        return null;
    }

    public ResponseEntity<PersonagemConsultaDto> buscaPorId(Integer id) {
        return null;
    }

    public ResponseEntity<PersonagemConsultaDto> cria(PersonagemCriacaoDto personagemCriacaoDto) {
        return null;
    }

    public ResponseEntity<List<PersonagemConsultaDto>> buscarPorCodinomeAproximado(String termo) {
        return null;
    }

    public ResponseEntity<List<PersonagemConsultaDto>> buscarNascidosApos(LocalDate data) {
        return null;
    }

    public ResponseEntity<List<PersonagemConsultaDto>> buscarTop3() {
        return null;
    }

    public ResponseEntity<Double> buscarMenorPoder() {
        return null;
    }
}