package matriz_vetor.Exercicio2;

import java.util.Scanner;

public class VerificarLogin {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String login, senha;
        String[][] loginSenhas = {
            {"Azien", "1234"},
            {"Kadu", "4321"},
            {"Caio", "3241"},
            {"Gege", "1243"},
            {"Tevez", "4312"},
            {"Pedro", "3241"}
        };

        System.out.print("Digite seu login: ");
        login = scan.nextLine();

        System.out.print("Digite sua senha: ");
        senha = scan.nextLine();

        boolean logou = false;

        for (int l = 0; l < loginSenhas.length; l++) {
            if (login.equals(loginSenhas[l][0]) && senha.equals(loginSenhas[l][1])) {
                logou = true;
                break;
            }
        }

        if (logou) {
            System.out.println("Logou!");
        } else {
            System.out.println("Não logou.");
        }
        scan.close();
    }
}
