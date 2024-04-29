package sptech.projetojpa2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import sptech.projetojpa2.dominio.Musica;
import sptech.projetojpa2.dtos.MusicaResumidoResponse;
import sptech.projetojpa2.dtos.MusicaSimplesResponse;

import java.time.LocalDate;
import java.util.List;

/*
Uma Repository centraliza os comandos de acesso a banco de dados
de uma entidade (tabela)

JpaRepository<1,2>
1 - Classe da Entidade
2 - Classe do Id (PK) da Entidade

Não é necessário criar uma implementação dessa interface.
O Spring criará uma com os comandos SQL para o banco de dados que estivermos usando
 */
public interface MusicaRepository extends
        JpaRepository<Musica, Integer> {

    List<Musica> findByNome(String nome);
    List<Musica> findByNomeContains(String nome);
    List<Musica> findByLancamentoAfter(LocalDate data);
    List<Musica> findTop3ByOrderByLancamento();

    @Transactional
    @Modifying
    long deleteByLancamentoBefore(LocalDate data);

    @Query("select m.foto from Musica m where m.codigo = ?1")
    byte[] findFotoByCodigo(Integer Id);

    List<Musica> findByCompositorApelido(String Apelido);

    @Query("select new Musica(m.codigo,m.nome) from Musica m")
    List<MusicaSimplesResponse> findSimples();

    @Query("select new Musica(m.codigo,m.nome,m.compositor) from Musica m")
    List<MusicaResumidoResponse> MusicaResumidoResponse();
}