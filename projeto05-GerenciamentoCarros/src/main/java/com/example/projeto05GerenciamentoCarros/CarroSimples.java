package com.example.projeto05GerenciamentoCarros;

import java.util.List;

public class CarroSimples extends Carro {
    private String marcaModelo;
    private Integer ano;
    private Double preco;
    private Double IPVA;

    public CarroSimples(Carro carro) {
        this.marcaModelo = "%s %s".formatted(carro.getMarca(), carro.getModelo());
        this.preco = carro.getPreco();
        this.ano = carro.getAno();
        this.IPVA = ano >= 2000 ? preco * 0.05 : 0.0;
    }

    public static List<CarroSimples> listaCarrosSimples(List<Carro> carros){
        return carros.stream().map(CarroSimples:: new).toList();
    }

    @Override
    public String getMarcaModelo() {
        return marcaModelo;
    }

    @Override
    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    @Override
    public Integer getAno() {
        return ano;
    }

    @Override
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getIPVA() {
        return IPVA;
    }

    public void setIPVA(Double IPVA) {
        this.IPVA = IPVA;
    }
}
