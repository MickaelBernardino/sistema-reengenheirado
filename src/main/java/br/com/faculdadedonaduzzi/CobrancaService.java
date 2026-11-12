package br.com.faculdadedonaduzzi;

public class CobrancaService {

    private CalculadoraDeValores calculadora;
    private AplicadorDeRegrasDesconto descontoAplicador;
    private AplicadorDeRegrasAcrescimo acrescimoAplicador;

    public CobrancaService() {
        this.calculadora = new CalculadoraDeValores();
        this.descontoAplicador = new AplicadorDeRegrasDesconto();
        this.acrescimoAplicador = new AplicadorDeRegrasAcrescimo();
    }

    public double calcular(int codigoTipo, double[] valores, boolean st) {

        AtendimentoTipo tipo = AtendimentoTipo.fromCodigo(codigoTipo);

        double soma = calculadora.somarValores(valores);

        double comDesconto =
                descontoAplicador.aplicarDesconto(soma, tipo);

        boolean aplicarAcrescimo =
                tipo == AtendimentoTipo.CONVENIO && st;

        return acrescimoAplicador.aplicarAcrescimo(
                comDesconto, aplicarAcrescimo
        );
    }
}
