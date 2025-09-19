package atividade6.ex2.model;

public class Videolocadora {
    private String[] filmes;
    private int[] vezesAlugado;
    private double[] precosLocacao;

    public void setFilmes(String[] filmes) {
        this.filmes = filmes;
    }

    public void setVezesAlugado(int[] vezesAlugado) {
        this.vezesAlugado = vezesAlugado;
    }

    public void setPrecosLocacao(double[] precosLocacao) {
        this.precosLocacao = precosLocacao;
    }

    public void listarFilmes() {
        System.out.println("Filmes disponíveis:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println(filmes[i] + 
                               " | Preço: R$" + precosLocacao[i] + 
                               " | Alugado " + vezesAlugado[i] + " vezes");
        }
    }

    public double faturamentoEsperado() {
        double total = 0;
        for (int i = 0; i < filmes.length; i++) {
            total += precosLocacao[i];
        }
        return total;
    }

    public void filmeMaisAlugado() {
        int indiceMais = 0;
        for (int i = 1; i < vezesAlugado.length; i++) {
            if (vezesAlugado[i] > vezesAlugado[indiceMais]) {
                indiceMais = i;
            }
        }
        System.out.println("Filme mais alugado: " + filmes[indiceMais] + 
                           " (" + vezesAlugado[indiceMais] + " vezes)");
    }

    public void alugarFilme(String nome) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i].equalsIgnoreCase(nome)) {
                vezesAlugado[i]++;
                System.out.println("Você alugou: " + filmes[i]);
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    public void devolverFilme(String nome) {
        for (String filme : filmes) {
            if (filme.equalsIgnoreCase(nome)) {
                System.out.println("Filme devolvido: " + filme);
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }
}
