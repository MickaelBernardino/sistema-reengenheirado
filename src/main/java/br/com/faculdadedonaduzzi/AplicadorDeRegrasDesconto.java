package br.com.faculdadedonaduzzi;

public class AplicadorDeRegrasDesconto {

    public double aplicarDesconto(double valor, AtendimentoTipo tipo) {

        if (tipo == AtendimentoTipo.CONVENIO) {
            return valor - (valor * 0.12);
        }

        if (tipo == AtendimentoTipo.PARTICULAR && valor > 500) {
            return valor - (valor * 0.05);
        }

        return valor;
    }
}
