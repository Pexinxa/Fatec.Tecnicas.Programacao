package exercicio3.view;

import exercicio3.model.Produto;

public class Main {
     public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500, 10);

        produto.setPreco(-1000); 
        produto.setQuantidadeEstoque(-5); 

        System.out.println("Produto: " + produto.getNome() +
                           " | Preço: R$" + produto.getPreco() +
                           " | Estoque: " + produto.getQuantidadeEstoque());
    }
}
