package com.example;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Medicamento {

    @NotBlank
    @Size(min = 3, max = 5)
    private String codigo;

    @NotBlank
    @Size(min = 4, max = 30)
    private String nome;

    @NotNull
    @PositiveOrZero
    private Double valorUnd;

    @NotNull
    @PositiveOrZero
    private Integer quantidade;

    private boolean precisaReceita;

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getValorUnd() {
        return valorUnd;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public void setValorUnd(Double valorUnd) {
        this.valorUnd = valorUnd;
    }

    public void aumentarQuantidade(Integer aumento) {
        this.quantidade += aumento;
    }

    public void atualizarPrecoQuantidade(MedicamentoPatchValorQuantidade patch) {
        setValorUnd(patch.getNovoValorUnd());
        aumentarQuantidade(patch.getQuantidadeEntrada());
    }
}
