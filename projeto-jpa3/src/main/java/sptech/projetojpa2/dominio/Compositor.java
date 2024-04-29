package sptech.projetojpa2.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Compositor {

    @Id // do pacote jakarta.persistence -> indica que este atributo é o "id", ou seja, a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que a chave primária é auto-incremento
    private Integer codigo;
    private String nome;
    private String apelido;
    @JsonIgnore
    @Column(length = 3 * 1024 * 1024, name = "documento")
    private byte[] documento;


    public Compositor() {
    }

    public Compositor(Integer codigo, String apelido) {
        this.codigo = codigo;
        this.apelido = apelido;
    }

    public Compositor(String nome) {
        this.nome = nome;
    }

    public byte[] getDocumento() {
        return documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}