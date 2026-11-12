package br.com.faculdadedonaduzzi;

public class CalculadoraDeValores {

    public double somarValores(double[] valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma;
    }
}
