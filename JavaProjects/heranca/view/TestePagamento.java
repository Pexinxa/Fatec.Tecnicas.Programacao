package heranca.view;

import heranca.model.Pagamento;
import heranca.model.PagamentoCartao;
import heranca.model.PagamentoDinheiro;

public class TestePagamento {
    public static void main(String[] args) {
        double valor = 100.00;

        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoDinheiro = new PagamentoDinheiro();

        double valorFinalCartao = pagamentoCartao.calcularPagamento(valor);
        double valorFinalDinheiro = pagamentoDinheiro.calcularPagamento(valor);

        System.out.println(pagamentoCartao.emitirRecibo(valor, valorFinalCartao));
        System.out.println("\n-------------------------\n");
        System.out.println(pagamentoDinheiro.emitirRecibo(valor, valorFinalDinheiro));
    }
}
