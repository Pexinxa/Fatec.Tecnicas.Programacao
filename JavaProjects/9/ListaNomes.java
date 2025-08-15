import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para verificar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome \"" + nomeBusca + "\" está na lista!");
        } else {
            System.out.println("O nome \"" + nomeBusca + "\" NÃO está na lista.");
        }

        scanner.close();
    }
}
