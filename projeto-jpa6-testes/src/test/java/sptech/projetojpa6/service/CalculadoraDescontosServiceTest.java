package sptech.projetojpa6.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontosServiceTest {

    @Test
    @DisplayName("Salário até 2000 deve ter desconto de 10%")
    void getDescontoInss1000() {
        var service = new CalculadoraDescontosService();
        var desconto = service.getDescontoInss(1000.0);
        assertEquals(100.0, desconto);
    }

    @Test
    @DisplayName("Salário até ]2mil .. 4mil] deve ter desconto de 10%")
    void getDescontoInss3500() {
        var service = new CalculadoraDescontosService();
        var desconto = service.getDescontoInss(1000.0);
        assertEquals(525.0, desconto);
    }
}