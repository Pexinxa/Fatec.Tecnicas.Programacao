import java.util.Scanner;

public class MenuAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU DE CÁLCULOS ===");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção (1 ou 2): ");
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;

            case 2:
                
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
