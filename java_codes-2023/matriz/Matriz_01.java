package Codigos;

import java.util.Scanner;

public class Matriz_01 {

	public static void main(String[] args) {
		int matriz [] [] = new int [2] [3];
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----------Matriz de elementos-----------");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Informe o número inteiro da matriz " + (i+1) + ": ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		for (int i = 0; i<2;i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Números informados: " + matriz[i][j]);
			}
		}

	}

}
