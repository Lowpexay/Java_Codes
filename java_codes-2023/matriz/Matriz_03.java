package Codigos;

import java.util.Scanner;

public class Matriz_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] [] = new int [2] [3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				numeros[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Matriz inserida: ");
		
		for(int i =0; i<2; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
		}
		
	}

}
