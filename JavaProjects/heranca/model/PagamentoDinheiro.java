package heranca.model;

public class PagamentoDinheiro implements Pagamento {
    private static final double DESCONTO = 0.10; // 10%

    @Override
    public double calcularPagamento(double valor) {
        return valor - (valor * DESCONTO);
    }

    @Override
    public String emitirRecibo(double valorOriginal, double valorFinal) {
        return "Pagamento em Dinheiro:\nValor Original: R$" + valorOriginal +
               "\nDesconto (10%): R$" + (valorOriginal - valorFinal) +
               "\nValor Final: R$" + valorFinal;
    }
}
