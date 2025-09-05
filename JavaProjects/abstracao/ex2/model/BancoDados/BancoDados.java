package abstracao.ex2.model.BancoDados;

public class BancoDados {
    public int quantidadeTabela;
    public String nomeBanco, tipoBanco, dataCriacao, dataAtualizacao;

    public void conectarBanco(){
        System.out.println("Conectando ao banco " + nomeBanco);
    }
    public void inserirDados(){
        System.out.println("Inserindo dados no banco " + nomeBanco);
    }
    public void consultarDados(){
        System.out.println("Consultando dados no banco " + nomeBanco);
    }
    public void detalhes(){
        System.out.println("Nome do banco: " + nomeBanco);
        System.out.println("Tipo do banco: " + tipoBanco);
        System.out.println("Quantidade de tabelas: " + quantidadeTabela);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Data de Atualização: " + dataAtualizacao);
    }
}