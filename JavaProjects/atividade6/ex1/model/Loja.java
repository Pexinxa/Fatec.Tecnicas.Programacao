package atividade6.ex1.model;

public class Loja {
    private String[] nomesProdutos;
    private int[] quantidadeEstoque;
    private double[] precosProdutos;

    public void setNomesProdutos(String[] nomesProdutos) {
        this.nomesProdutos = nomesProdutos;
    }

    public void setQuantidadeEstoque(int[] quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setPrecosProdutos(double[] precosProdutos) {
        this.precosProdutos = precosProdutos;
    }

    public void exibirProdutos() {
        System.out.println("Produtos da loja:");
        for (int i = 0; i < nomesProdutos.length; i++) {
            System.out.println(nomesProdutos[i] +
                               " | Preço: R$" + precosProdutos[i] +
                               " | Quantidade: " + quantidadeEstoque[i]);
        }
    }

    public void produtoMaisCaroMaisBarato() {
        int indiceCaro = 0;
        int indiceBarato = 0;

        for (int i = 1; i < precosProdutos.length; i++) {
            if (precosProdutos[i] > precosProdutos[indiceCaro]) {
                indiceCaro = i;
            }
            if (precosProdutos[i] < precosProdutos[indiceBarato]) {
                indiceBarato = i;
            }
        }

        System.out.println("Produto mais caro: " + nomesProdutos[indiceCaro] +
                           " (R$" + precosProdutos[indiceCaro] + ")");
        System.out.println("Produto mais barato: " + nomesProdutos[indiceBarato] +
                           " (R$" + precosProdutos[indiceBarato] + ")");
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < nomesProdutos.length; i++) {
            total += precosProdutos[i] * quantidadeEstoque[i];
        }
        return total;
    }

    public void comprarProduto(String nome, int quantidade) {
        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i].equalsIgnoreCase(nome)) {
                if (quantidadeEstoque[i] >= quantidade) {
                    quantidadeEstoque[i] -= quantidade;
                    System.out.println("Compra realizada! Restam " + quantidadeEstoque[i] + " unidades de " + nomesProdutos[i]);
                } else {
                    System.out.println("Estoque insuficiente de " + nomesProdutos[i]);
                }
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void reporProduto(String nome, int quantidade) {
        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i].equalsIgnoreCase(nome)) {
                quantidadeEstoque[i] += quantidade;
                System.out.println("Produto " + nomesProdutos[i] + " reposto! Agora tem " + quantidadeEstoque[i] + " unidades.");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
}
