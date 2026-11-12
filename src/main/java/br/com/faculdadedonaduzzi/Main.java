package br.com.faculdadedonaduzzi;

public class Main {

    public static void main(String[] args) {

        CobrancaService service = new CobrancaService();

        testar(service, 1, new double[]{200, 100}, true);
        testar(service, 1, new double[]{200, 100}, false);
        testar(service, 2, new double[]{300, 300}, true);
        testar(service, 2, new double[]{200, 100}, true);
        testar(service, 3, new double[]{200, 100}, true);
    }

    public static void testar(CobrancaService service,
                              int tipo,
                              double[] valores,
                              boolean st) {

        double resultado = service.calcular(tipo, valores, st);

        System.out.println("Tipo: " + tipo
                + " | Resultado: " + resultado);
    }
}
