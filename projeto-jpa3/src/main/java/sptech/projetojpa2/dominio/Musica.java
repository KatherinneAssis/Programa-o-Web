package sptech.projetojpa2.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

/*
@Entity -> Indica que a classe é uma Entidade
            Ou seja, ela mapeia, "espelha" uma tabela
 */
@Entity
public class Musica {

    @Id // do pacote jakarta.persistence -> indica que este atributo é o "id", ou seja, a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que a chave primária é auto-incremento
    private Integer codigo;

    @NotBlank
    @Size(min = 2, max = 30)
    private String nome;
    private Integer ouvintesTotal;

    // @NotNull
    private LocalDate lancamento;

    private String estilo;

    private Boolean classico;

    @JsonIgnore
    @Column(length = 20 * 1024 * 1024, name = "musica_foto")
    private byte[] foto;


    @ManyToOne
    private Compositor compositor;

    public Musica(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Musica(Integer codigo, String nome, String compositor) {
        this.codigo = codigo;
        this.nome = nome;
        this.compositor = new Compositor(compositor);
    }

    public Musica() {

    }

    public Musica(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Compositor getCompositor() {return compositor;}

    public void setCompositor(Compositor compositor) {this.compositor = compositor;}

    public String getEstilo() {return estilo;}

    public void setEstilo(String estilo) {this.estilo = estilo;}
    public Boolean getClassico() {
        return classico;
    }

    public void setClassico(Boolean classico) {
        this.classico = classico;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    // todos os campos precisam ter get e set para que funcionem corretamente
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getOuvintesTotal() {
        return ouvintesTotal;
    }

    public void setOuvintesTotal(Integer ouvintesTotal) {
        this.ouvintesTotal = ouvintesTotal;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}