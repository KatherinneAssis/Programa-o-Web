package sptech.school.exerciciodynamicjpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.school.exerciciodynamicjpql.entity.Filme;

import java.time.LocalDate;
import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {

    List<Filme> findByTituloContainsIgnoreCase(String titulo);

    List<Filme> findByDataLancamentoBetween(LocalDate dataInicio, LocalDate dataFim);

//    @Query("SELECT MIN(f.custoProducao) FROM Filme f")
//    findTop3ByOrderByPoderDesc
    Filme findTopByOrderByCustoProducaoAsc();
}