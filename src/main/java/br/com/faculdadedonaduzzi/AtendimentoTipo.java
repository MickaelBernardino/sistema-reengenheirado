package br.com.faculdadedonaduzzi;

public enum AtendimentoTipo {
    CONVENIO,
    PARTICULAR,
    OUTRO;

    public static AtendimentoTipo fromCodigo(int codigo) {
        switch (codigo) {
            case 1:
                return CONVENIO;
            case 2:
                return PARTICULAR;
            default:
                return OUTRO;
        }
    }
}
