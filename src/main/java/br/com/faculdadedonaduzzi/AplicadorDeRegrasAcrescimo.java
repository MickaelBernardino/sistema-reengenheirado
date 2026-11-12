package br.com.faculdadedonaduzzi;

public class AplicadorDeRegrasAcrescimo {

    public double aplicarAcrescimo(double valor, boolean aplicar) {
        if (aplicar) {
            return valor + 15.50;
        }

        return valor;
    }
}
