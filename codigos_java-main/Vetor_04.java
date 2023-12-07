package Codigos;

import java.util.Scanner;

public class Vetor_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numInteiro [] = new int [5];
		int resultado = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o número inteiro para ser somado: ");
			numInteiro[i] = entrada.nextInt();
			resultado += numInteiro[i];
		}
		
		System.out.println("Resultado final: " + resultado);
		

	}

}
