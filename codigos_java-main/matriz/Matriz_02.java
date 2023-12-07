package Codigos;

import java.util.Scanner;

public class Matriz_02 {

	public static void main(String[] args) {
		int clientes [] [] = new int [4] [5];
		Scanner scanner = new Scanner(System.in);
		

        for (int i = 0; i < 4; i++) {
            System.out.println("Informações do cliente " + (i + 1) + ":");
            System.out.print("Código do cliente: ");
            clientes[i][0] = scanner.nextInt();
            System.out.print("Quantidade de milhas: ");
            clientes[i][1] = scanner.nextInt();
            System.out.print("Categoria (1-Diamante, 2-Ouro, 3-Prata): ");
            clientes[i][2] = scanner.nextInt();

            // Calcula o bônus com base na categoria
            if (clientes[i][2] == 1) { // Diamante
                clientes[i][3] = 10000;
            } else if (clientes[i][2] == 2) { // Ouro
                clientes[i][3] = 5000;
            } else if (clientes[i][2] == 3) { // Prata
                clientes[i][3] = 0;
            } else {
                clientes[i][3] = 0; // Categoria desconhecida
            }

            // Calcula a quantidade atualizada de milhas
            clientes[i][4] = clientes[i][1] + clientes[i][3];
        }
        // Exibe os dados dos clientes
        System.out.println("\nDados dos clientes:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Código: " + clientes[i][0]);
            System.out.println("Quantidade de Milhas: " + clientes[i][1]);
            System.out.println("Categoria: " + clientes[i][2]);
            System.out.println("Bônus: " + clientes[i][3]);
            System.out.println("Quantidade Atualizada: " + clientes[i][4]);
            System.out.println();
        }

		

	}

}
