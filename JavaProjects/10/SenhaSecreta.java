import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        String senhaSecreta = "Java123"; 
        String senhaInserida; 
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.print("Insira a senha: ");
            senhaInserida = scanner.nextLine(); 
            
            if (senhaInserida.equals(senhaSecreta)) {
                System.out.println("Senha correta! Acesso concedido.");
                break; 
            } else {
                System.out.println("Senha incorreta! Tente novamente."); 
            }
        }

        scanner.close(); 
    }
}
