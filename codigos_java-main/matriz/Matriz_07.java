package Codigos;

import java.util.Scanner;

public class Matriz_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizEstoque = new int[5][3];

        // Entrada de dados: Preencher a matriz com estoque atual de produtos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o estoque do produto " + (j + 1) + " no armazém " + (i + 1) + ": ");
                matrizEstoque[i][j] = scanner.nextInt();
            }
        }

        // Calcular o custo de cada produto (última linha da matriz)
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                matrizEstoque[4][j] += matrizEstoque[i][j];
            }
        }

        // a. Quantidade de itens armazenados em cada armazém
        System.out.println("a. Quantidade de itens armazenados em cada armazém:");
        for (int i = 0; i < 4; i++) {
            int totalArmazem = 0;
            for (int j = 0; j < 3; j++) {
                totalArmazem += matrizEstoque[i][j];
            }
            System.out.println("Armazém " + (i + 1) + ": " + totalArmazem + " itens");
        }

        // b. Armazém com maior estoque do produto 2
        int maiorEstoqueProduto2 = -1;
        int armazemMaiorEstoqueProduto2 = -1;
        for (int i = 0; i < 4; i++) {
            if (matrizEstoque[i][1] > maiorEstoqueProduto2) {
                maiorEstoqueProduto2 = matrizEstoque[i][1];
                armazemMaiorEstoqueProduto2 = i + 1;
            }
        }
        System.out.println("b. Armazém com maior estoque do produto 2: Armazém " + armazemMaiorEstoqueProduto2);

        // c. Armazém com menor estoque
        int menorEstoque = Integer.MAX_VALUE;
        int armazemMenorEstoque = -1;
        for (int i = 0; i < 4; i++) {
            int estoqueArmazem = 0;
            for (int j = 0; j < 3; j++) {
                estoqueArmazem += matrizEstoque[i][j];
            }
            if (estoqueArmazem < menorEstoque) {
                menorEstoque = estoqueArmazem;
                armazemMenorEstoque = i + 1;
            }
        }
        System.out.println("c. Armazém com menor estoque: Armazém " + armazemMenorEstoque);

        // d. Custo total de cada produto
        System.out.println("d. Custo total de cada produto:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Produto " + (j + 1) + ": " + matrizEstoque[4][j]);
        }

        // e. Custo total de cada armazém
        System.out.println("e. Custo total de cada armazém:");
        for (int i = 0; i < 4; i++) {
            int custoArmazem = 0;
            for (int j = 0; j < 3; j++) {
                custoArmazem += matrizEstoque[i][j];
            }
            System.out.println("Armazém " + (i + 1) + ": " + custoArmazem);
        }
    }
}

