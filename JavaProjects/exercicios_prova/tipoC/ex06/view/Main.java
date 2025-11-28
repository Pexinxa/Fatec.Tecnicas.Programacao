package exercicios_prova.tipoC.ex06.view;

import exercicios_prova.tipoC.ex06.model.Celular;

public class Main {
     public static void main(String[] args) {
    Celular celular1 = new Celular();
    celular1.marca = "Apple";
    celular1.modelo = "Iphone 13";
    celular1.preco = 4359.99;

    System.out.println("Marca do celular: " + celular1.marca);
    System.out.println("Modelo do celular: " + celular1.modelo);
    System.out.println("Preço do celular: " + celular1.preco);
}
}
