package Codigos;

import java.util.Scanner;

public class Matriz_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int linhas = 0;
		int colunas = 0;
		int soma = 0;

		System.out.println("Insira o número de linhas: ");
		linhas = entrada.nextInt();
		System.out.println("Insira o número de colunas: ");
		colunas = entrada.nextInt();
		
		int matriz[][] = new int [linhas][colunas];
		
		System.out.println("Digite os elementos da matriz: ");
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		
		 for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                soma += matriz[i][j];
	            }
	        }
		 System.out.println("A soma dos elementos da matriz é: " + soma);
		
	}

}
