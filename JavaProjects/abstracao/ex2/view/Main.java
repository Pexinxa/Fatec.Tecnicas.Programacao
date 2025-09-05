package abstracao.ex2.view;

import abstracao.ex2.model.aplicativo.*;
import abstracao.ex2.model.aula.*;
import abstracao.ex2.model.BancoDados.BancoDados;
import abstracao.ex2.model.pedido.Pedido;
import abstracao.ex2.model.produto.Produto; 

public class Main {
    public static void main(String[] args) {

        {
            Aplicativo brawlStars = new Aplicativo();
            brawlStars.nome = "Brawl Stars";
            brawlStars.categoria = "Battle Royale";
            brawlStars.desenvolvedor = "Supercell";
            brawlStars.tamanho = 18.62;
            brawlStars.versao = "9.32.3";

            brawlStars.executar();
            brawlStars.instalador();
            brawlStars.executar();
            brawlStars.desinstalador();
            brawlStars.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Aplicativo clashRoyale = new Aplicativo();
            clashRoyale.nome = "Clash Royale";
            clashRoyale.categoria = "Estratégia";
            clashRoyale.desenvolvedor = "Supercell";
            clashRoyale.tamanho = 15.20;
            clashRoyale.versao = "8.14.2";

            clashRoyale.executar();
            clashRoyale.instalador();
            clashRoyale.executar();
            clashRoyale.desinstalador();
            clashRoyale.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Aula tecnicasProg = new Aula();
            tecnicasProg.professor = "Alessandro";
            tecnicasProg.material = "Desktop/Computador com Linux";
            tecnicasProg.gradeCurricular = "Abstração, Encapsulamento, Herança e Polimorfismo";
            tecnicasProg.cargaHoraria = 20;

            tecnicasProg.calcularMedia(9, 6.7, 8.3);
            tecnicasProg.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Aula estruturaDados = new Aula();
            estruturaDados.professor = "Fernada";
            estruturaDados.material = "Desktop/Computador com internet";
            estruturaDados.gradeCurricular = "Array, Matriz, Classes, Métodos, Objetos, etc...";
            estruturaDados.cargaHoraria = 20;

            estruturaDados.calcularMedia(5.7, 8.1, 7.9);
            estruturaDados.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            BancoDados mariadb = new BancoDados();
            mariadb.nomeBanco = "MariaDB";
            mariadb.tipoBanco = "SQL";
            mariadb.quantidadeTabela = 4;
            mariadb.dataCriacao = "29/10/2009";
            mariadb.dataAtualizacao = "29/10/2009";

            mariadb.conectarBanco();
            mariadb.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            BancoDados mongoDB = new BancoDados();
            mongoDB.nomeBanco = "MongoDB";
            mongoDB.tipoBanco = "NoSQL";
            mongoDB.quantidadeTabela = 5;
            mongoDB.dataCriacao = "12/12/2006";
            mongoDB.dataAtualizacao = "12/12/2006";

            mongoDB.conectarBanco();
            mongoDB.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Pedido pedido1 = new Pedido();
            pedido1.codigoPedido = "12345";
            pedido1.data = "08/03/2025";
            pedido1.valorTotal = 12350.75;
            pedido1.cliente = "Anderson";
            pedido1.itens = "Notebook Dell, iPhone 16, iPod";

            pedido1.removerItem("iPod");
            pedido1.calcularValorTotal();
            pedido1.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Pedido pedido2 = new Pedido();
            pedido2.codigoPedido = "69696";
            pedido2.data = "05/07/2025";
            pedido2.valorTotal = 2350.50;
            pedido2.cliente = "Pedro";
            pedido2.itens = "Monitor Alienware, Teclado Mecânico";

            pedido2.adicionarItem("Alienware 16 Aurora");
            pedido2.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Produto produto1 = new Produto();
            produto1.cadastrarProduto("iPhone 16", "Eletrônicos", 6999.99);
            produto1.atualizarPreco(6499.99);
            produto1.detalhes();
        }
        System.out.println("###---###---###---###---###");

        {
            Produto produto2 = new Produto();
            produto2.cadastrarProduto("Samsung Galaxy S22", "Eletrônicos", 4499.99);
            produto2.atualizarPreco(4499.99);
            produto2.detalhes();
        }
        System.out.println("###---###---###---###---###");
    }
}
