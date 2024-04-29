package com.example.projeto05GerenciamentoCarros;

import jakarta.validation.constraints.*;

import java.util.List;
import java.util.UUID;

public abstract class Carro {

    private UUID id = UUID.randomUUID();

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    private String cor;

    @NotBlank
    @Size(min = 7, max = 8)
    private String placa;

    @NotNull
    private Double preco;

    @NotNull
    @Min(1960)
    private Integer ano;

    private String motivoMudancaPlaca;


    public Boolean buscarPlaca(Carro carro, List<Carro> listaCarros) {
        String placaPesquisada = carro.getPlaca();

        var placaEncontrada = listaCarros.stream().
                anyMatch(Carro -> Carro.getPlaca().equals(placaPesquisada));

        if (placaEncontrada){
            return true;
        }
        listaCarros.add(carro);
        return false;
    }



    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMotivoMudancaPlaca() {
        return motivoMudancaPlaca;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public abstract String getMarcaModelo();

    public void setMarcaModelo(String marcaModelo) {
        this.marca = marcaModelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setMotivoMudancaPlaca(String motivoMudancaPlaca) {
        this.motivoMudancaPlaca = motivoMudancaPlaca;
    }
}
