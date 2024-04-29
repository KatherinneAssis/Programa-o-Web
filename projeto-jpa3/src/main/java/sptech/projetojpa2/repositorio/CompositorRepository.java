package sptech.projetojpa2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.projetojpa2.dominio.Compositor;
import sptech.projetojpa2.dtos.CompositorSimplesResponse;

import java.util.List;

public interface CompositorRepository extends JpaRepository<Compositor, Integer>{

    @Query("select m.documento from Compositor m where m.codigo = ?1")
    byte[] findDocumentoByCodigo(Integer Id);

    @Query("select new Compositor(m.codigo,m.apelido) from Compositor m")
    List<CompositorSimplesResponse> findSimples();

}