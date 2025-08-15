package matriz_vetor.Exercicio3;

import java.util.Scanner;

public class TransporMatriz {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite o número de linhas: ");
       int linhas = sc.nextInt();
       System.out.print("Digite o número de colunas: ");
       int colunas = sc.nextInt();
       int[][] matriz = new int[linhas][colunas];
       System.out.println("Digite os elementos da matriz:");
       for (int i = 0; i < linhas; i++) {
           for (int j = 0; j < colunas; j++) {
               System.out.printf("Elemento [%d][%d]: ", i, j);
               matriz[i][j] = sc.nextInt();
           }
       }
       System.out.println("\nMatriz Transposta:");
       for (int i = 0; i < colunas; i++) {
           for (int j = 0; j < linhas; j++) {
               System.out.print(matriz[j][i] + " ");
           }
           System.out.println();
       }
       sc.close();
   }
}
