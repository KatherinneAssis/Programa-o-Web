package sptech.projetojpa2.dtos;

import sptech.projetojpa2.dominio.Compositor;
import sptech.projetojpa2.dominio.Musica;

public class CompositorSimplesResponse {
    private Integer codigo;
    private String apelido;

    public CompositorSimplesResponse(Compositor compositor) {
        this.codigo = compositor.getCodigo();
        this.apelido = compositor.getApelido();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getApelido() {
        return apelido;
    }
}