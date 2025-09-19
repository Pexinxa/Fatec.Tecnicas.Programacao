package atividade6.ex3.model;

public class Biblioteca {
    private String[] livros;
    private int[] diasAtraso;
    private double[] multaPorDia;

    public void setLivros(String[] livros) {
        this.livros = livros;
    }

    public void setDiasAtraso(int[] diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public void setMultaPorDia(double[] multaPorDia) {
        this.multaPorDia = multaPorDia;
    }

    public void mostrarLivros() {
        System.out.println("Livros cadastrados:");
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i] +
                               " | Dias atraso: " + diasAtraso[i] +
                               " | Multa por dia: R$" + multaPorDia[i]);
        }
    }

    public double multaTotal() {
        double total = 0;
        for (int i = 0; i < livros.length; i++) {
            total += diasAtraso[i] * multaPorDia[i];
        }
        return total;
    }

    public double mediaDiasAtraso() {
        int soma = 0;
        int count = 0;
        for (int dias : diasAtraso) {
            if (dias > 0) {
                soma += dias;
                count++;
            }
        }
        return count > 0 ? (double) soma / count : 0;
    }

    public void emprestarLivro(String nome) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equalsIgnoreCase(nome)) {
                System.out.println("Livro emprestado: " + livros[i]);
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void devolverLivro(String nome, int dias) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equalsIgnoreCase(nome)) {
                diasAtraso[i] = dias;
                System.out.println("Livro devolvido: " + livros[i] +
                                   " | Dias atraso: " + dias +
                                   " | Multa acumulada: R$" + (dias * multaPorDia[i]));
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }
}