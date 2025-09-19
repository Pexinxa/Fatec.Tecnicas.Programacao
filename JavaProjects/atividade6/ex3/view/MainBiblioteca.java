package atividade6.ex3.view;

import atividade6.ex3.model.Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        String[] livros = {"Dom Casmurro", "1984", "Senhor dos Anéis", "O Pequeno Príncipe"};
        int[] dias = {0, 2, 5, 0};
        double[] multas = {1.50, 2.00, 2.50, 1.00};

        biblioteca.setLivros(livros);
        biblioteca.setDiasAtraso(dias);
        biblioteca.setMultaPorDia(multas);

        biblioteca.mostrarLivros();
        System.out.println("Multa total: R$" + biblioteca.multaTotal());
        System.out.println("Média de dias de atraso: " + biblioteca.mediaDiasAtraso());

        biblioteca.emprestarLivro("1984");
        biblioteca.devolverLivro("Senhor dos Anéis", 3);

        biblioteca.mostrarLivros();
    }
}