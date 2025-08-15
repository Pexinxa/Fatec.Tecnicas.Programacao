import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            int soma = 0;
            int numeroImpar = 1;

            for (int i = 1; i <= n; i++) {
                soma += numeroImpar;
                numeroImpar += 2; 
            }

            System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);
        }

        scanner.close();
    }
}
