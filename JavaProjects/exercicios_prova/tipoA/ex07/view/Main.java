package exercicios_prova.tipoA.ex07.view;

import exercicios_prova.tipoA.ex07.model.Aluno;

public class Main {
     public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Pedro");
    aluno1.setMatricula("x2987pxx69");
    aluno1.setNotaFinal(8.5, 9.75, 8.75);

    System.out.println("Nome do Aluno: " + aluno1.getNome());
    System.out.println("Matricula do Aluno: " + aluno1.getMatricula());
    System.out.println("Nota Final do Aluno: " + String.format("%.2f", aluno1.getNotaFinal()));
}
}
