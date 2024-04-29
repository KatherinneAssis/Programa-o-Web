package com.example.projeto05GerenciamentoCarros;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AtualizacaoCarro {

    @NotBlank
    @Size(min = 7, max = 8)
    private String novaPlaca;

    private String motivoMudancaPlaca;


    public void atualizarPlaca(Carro carro, AtualizacaoCarro attCarro){
        carro.setPlaca(attCarro.getNovaPlaca());
        carro.setMotivoMudancaPlaca(attCarro.getMotivoMudancaPlaca());
    }

    public String getNovaPlaca() {
        return novaPlaca;
    }

    public String getMotivoMudancaPlaca() {
        return motivoMudancaPlaca;
    }
}
