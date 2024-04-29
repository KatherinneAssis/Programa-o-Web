package com.example;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class MedicamentoPatchValorQuantidade {

    @NotNull
    @PositiveOrZero
    private Double novoValorUnd;

    @NotNull
    @PositiveOrZero
    private Integer quantidadeEntrada;

    public Double getNovoValorUnd() {
        return novoValorUnd;
    }

    public Integer getQuantidadeEntrada() {
        return quantidadeEntrada;
    }
}
