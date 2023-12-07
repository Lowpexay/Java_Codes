package Codigos;

import java.util.Scanner;

		public class Matriz_05 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a ordem da matriz identidade: ");
		        int ordem = scanner.nextInt();

		        int[][] matrizIdentidade = new int[ordem][ordem];

		        for (int i = 0; i < ordem; i++) {
		            for (int j = 0; j < ordem; j++) {
		                if (i == j) {
		                    matrizIdentidade[i][j] = 1;
		                } else {
		                    matrizIdentidade[i][j] = 0;
		                }
		            }
		        }

		        System.out.println("Matriz Identidade de ordem " + ordem + ":");

		        for (int i = 0; i < ordem; i++) {
		            for (int j = 0; j < ordem; j++) {
		                System.out.print(matrizIdentidade[i][j] + " ");
		            }
		            System.out.println();
		        }

		        
		    }


	}
