package sptech.projetojpa6.service;

public class CalculadoraDescontosService {

    public Double getDescontoInss(Double salario) {
        var desconto = salario * 0.10;
        return desconto;
    }
}