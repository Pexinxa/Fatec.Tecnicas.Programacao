package atividade6.ex2.view;

import atividade6.ex2.model.Videolocadora;

public class MainVideolocadora {
    public static void main(String[] args) {
        Videolocadora locadora = new Videolocadora();

        String[] filmes = {"Matrix", "Titanic", "Vingadores", "Homem-Aranha"};
        int[] alugados = {5, 12, 7, 3};
        double[] precos = {6.00, 5.50, 7.00, 6.50};

        locadora.setFilmes(filmes);
        locadora.setVezesAlugado(alugados);
        locadora.setPrecosLocacao(precos);

        locadora.listarFilmes();
        System.out.println("Faturamento esperado: R$" + locadora.faturamentoEsperado());
        locadora.filmeMaisAlugado();

        locadora.alugarFilme("Matrix");
        locadora.devolverFilme("Titanic");

        locadora.listarFilmes();
    }
}
