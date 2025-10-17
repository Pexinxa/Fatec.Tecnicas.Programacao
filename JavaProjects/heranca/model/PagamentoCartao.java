package heranca.model;

public class PagamentoCartao implements Pagamento {
    private static final double TAXA = 0.05; 

    @Override
    public double calcularPagamento(double valor) {
        return valor + (valor * TAXA);
    }

    @Override
    public String emitirRecibo(double valorOriginal, double valorFinal) {
        return "Pagamento com Cartão:\nValor Original: R$" + valorOriginal +
               "\nTaxa (5%): R$" + (valorFinal - valorOriginal) +
               "\nValor Final: R$" + valorFinal;
    }
}
