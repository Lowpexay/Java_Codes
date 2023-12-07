package Codigos;

import java.util.Scanner;

public class Vetor_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tamanho = 0;
		int somaNumeros = 0;
		double mediaNumeros = 0;
		
		System.out.println("Digite o tamanho do N: ");
		tamanho = entrada.nextInt();
		
		int N[] = new int [tamanho];
		
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Agora, digite os números que gostaria de colocar em N: ");
			N[i] = entrada.nextInt();
			
		}
		System.out.println("Números marcados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(N[i]);
        }
        for (int i = 0; i < tamanho; i++) {
            somaNumeros += N[i];
        }
        mediaNumeros = somaNumeros / tamanho;

        System.out.println("Soma dos números: " + somaNumeros);
        System.out.println("Média dos números: " + mediaNumeros);

        
		
	}

}
