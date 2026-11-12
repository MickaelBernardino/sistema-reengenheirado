package br.com.faculdadedonaduzzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CobrancaServiceTest {
    private static final double TOLERANCIA = 0.000001;
    private final CobrancaService service = new CobrancaService();

    @Test
    void convenioAplicaDescontoAntesDoAcrescimo() {
        assertEquals(279.50, service.calcular(1, new double[]{200, 100}, true), TOLERANCIA);
    }

    @Test
    void convenioSemAcrescimoAplicaDesconto() {
        assertEquals(264.00, service.calcular(1, new double[]{200, 100}, false), TOLERANCIA);
    }

    @Test
    void particularAcimaDeQuinhentosRecebeDesconto() {
        assertEquals(570.00, service.calcular(2, new double[]{300, 300}, true), TOLERANCIA);
    }

    @Test
    void particularNoLimiteMantemValor() {
        assertEquals(500.00, service.calcular(2, new double[]{500}, true), TOLERANCIA);
    }

    @Test
    void outroAtendimentoMantemValor() {
        assertEquals(300.00, service.calcular(3, new double[]{200, 100}, true), TOLERANCIA);
    }
}
