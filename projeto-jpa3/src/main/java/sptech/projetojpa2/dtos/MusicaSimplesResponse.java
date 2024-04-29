package sptech.projetojpa2.dtos;

import sptech.projetojpa2.dominio.Musica;

public class MusicaSimplesResponse {
    private Integer codigo;
    private String nome;

    public MusicaSimplesResponse(Musica musica) {
    this.codigo = musica.getCodigo();
    this.nome = musica.getNome();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}