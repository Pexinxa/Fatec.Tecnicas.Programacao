package atividade6.ex1.view;

import atividade6.ex1.model.Loja;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        String[] nomes = {"Arroz", "Feijão", "Macarrão", "Leite"};
        int[] quantidades = {10, 20, 15, 8};
        double[] precos = {5.50, 7.30, 4.20, 6.00};

        loja.setNomesProdutos(nomes);
        loja.setQuantidadeEstoque(quantidades);
        loja.setPrecosProdutos(precos);

        loja.exibirProdutos();
        loja.produtoMaisCaroMaisBarato();
        System.out.println("Valor total em estoque: R$" + loja.calcularValorTotalEstoque());

        loja.comprarProduto("Feijão", 5);
        loja.reporProduto("Leite", 10);

        loja.exibirProdutos();
    }
}

