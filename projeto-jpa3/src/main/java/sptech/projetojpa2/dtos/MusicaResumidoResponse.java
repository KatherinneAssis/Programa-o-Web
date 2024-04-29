package sptech.projetojpa2.dtos;

import sptech.projetojpa2.dominio.Compositor;
import sptech.projetojpa2.dominio.Musica;

public class MusicaResumidoResponse {
    private Integer codigo;
    private String nome;
    private String compositor;

    public MusicaResumidoResponse(Musica musica, Compositor compositor) {
        this.codigo = musica.getCodigo();
        this.nome = musica.getNome();
        this.compositor = compositor.getNome();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCompositor() {
        return compositor;
    }
}