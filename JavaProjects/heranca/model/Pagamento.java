package heranca.model;

public interface Pagamento {
    double calcularPagamento(double valor);
    String emitirRecibo(double valorOriginal, double valorFinal);
}
