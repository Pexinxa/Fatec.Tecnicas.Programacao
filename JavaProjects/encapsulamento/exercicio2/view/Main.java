package exercicio2.view;

import exercicio2.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro", 1000);

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000); 

        System.out.println("Saldo final de " + conta.getTitular() + ": R$" + conta.getSaldo());
    }
}
