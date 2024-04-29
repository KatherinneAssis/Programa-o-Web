package school.sptech.treino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import school.sptech.treino.entity.Personagem;

import java.time.LocalDate;
import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
}
