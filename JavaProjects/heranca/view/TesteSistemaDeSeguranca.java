package heranca.view;

import java.util.Scanner;
import heranca.model.SistemaDeSeguranca;;

public class TesteSistemaDeSeguranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        while (!sistema.isAutenticado()) {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo, " + usuario + "!");
            } else {
                System.out.println("Login incorreto. Tente novamente.\n");
            }
        }

        System.out.print("Deseja fazer logout? (s/n): ");
        String opcao = sc.nextLine();
        if (opcao.equalsIgnoreCase("s")) {
            sistema.logout();
        }

        sc.close();
    }
}
