package abstracao.ex2.model.aula;

public class Aula {
    public String professor, material, gradeCurricular;
    public double cargaHoraria;

    public void prova(){
        System.out.println("Aplicando prova...");
    }
    public void calcularMedia(double p1, double p2, double trabalho) {
        System.out.println("Na p1 você tirou: "+ p1 + ", na p2 " + p2 + " e no trabalho " + trabalho);
        System.out.println("Sua média final é: " + ((p1 + p2 + trabalho) / 3) + ".");
    }

    public void passarConteudo(){
        System.out.println("Professor está passando conteúdo, preste atenção!");
    }
    public void detalhes(){
        System.out.println("Professor: " + professor);
        System.out.println("Material: " + material);
        System.out.println("Grade Curricular: " + gradeCurricular);
        System.out.println("Carga Horária: " + cargaHoraria);
    }
}