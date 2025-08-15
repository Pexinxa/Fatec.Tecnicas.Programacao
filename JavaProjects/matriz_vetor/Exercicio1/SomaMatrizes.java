package matriz_vetor.Exercicio1;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int[][] matrizA = new int[3][3];
	        int[][] matrizB = new int[3][3];
	        int[][] matrizSoma = new int[3][3];
 
	        System.out.println("Digite os elementos da matriz A (3x3):");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matrizA[i][j] = scanner.nextInt();
	            }
	        }
 
	        System.out.println("Digite os elementos da matriz B (3x3):");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matrizB[i][j] = scanner.nextInt();
	            }
	        }
 
	       
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
	            }
	        }
 
	     
	        System.out.println("Resultado da soma das matrizes A e B:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrizSoma[i][j] + " ");
	            }
	            System.out.println();
	        }
 
	        scanner.close();
	
  }
}
