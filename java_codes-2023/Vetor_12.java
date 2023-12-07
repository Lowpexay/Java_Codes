package Codigos;

import java.util.Scanner;

public class Vetor_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor	= new int[tamanho];
        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Calcule a média dos valores no vetor
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        double media = soma / tamanho;

        // Exiba a média
        System.out.println("A média dos valores no vetor é: " + media);


	}

}
