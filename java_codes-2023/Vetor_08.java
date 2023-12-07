package Codigos;

import java.util.Scanner;

public class Vetor_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String letras [] = new String [5];
		
		
		System.out.println("Digite a seguir letras que deseja deixar na ordem de primeira para última");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite: ");
			letras[i] = entrada.next();
		}
		
		System.out.println("Resultado 1: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(letras[i]);
		}
		System.out.println("Resultado 2: ");	
		for(int i = letras.length -1; i >= 0; i--) {
			System.out.println(letras[i]);
		}
	}
	
}
