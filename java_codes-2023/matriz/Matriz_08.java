package Codigos;


import java.util.Scanner;

public class Matriz_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a matriz 5x3 para armazenar os dados de estoque e custo
        int[][] matriz = new int[5][3];

        // Preenchendo a matriz com os dados de estoque
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("-----------Estoque no armazém nº " + (i +1) + "-----------");
                System.out.print("Digite o estoque do produto " + (j + 1) + " no armazém " + (i + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Preenchendo a última linha da matriz com os custos dos produtos
        for (int j = 0; j < 3; j++) {
            System.out.print("Digite o custo do produto " + (j + 1) + ": ");
            matriz[4][j] = scanner.nextInt();
        }

        // Inicializando as variáveis com valores do primeiro armazém
        int maiorEstoqueProduto2 = matriz[0][1];
        int menorEstoque = matriz[0][0];
        int armazemMaiorEstoqueProduto2 = 0;
        int armazemMenorEstoque = 0;

        // Calculando a quantidade de itens armazenados em cada armazém
        int[] quantidadePorArmazem = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                quantidadePorArmazem[i] += matriz[i][j];
            }

            // Atualizando os valores máximo e mínimo
            if (matriz[i][1] > maiorEstoqueProduto2) {
                maiorEstoqueProduto2 = matriz[i][1];
                armazemMaiorEstoqueProduto2 = i;
            }

            int estoqueTotal = 0;
            for (int j = 0; j < 3; j++) {
                estoqueTotal += matriz[i][j];
            }
            if (estoqueTotal < menorEstoque) {
                menorEstoque = estoqueTotal;
                armazemMenorEstoque = i;
            }
        }

        // Calculando o custo total de cada produto
        int[] custoTotalPorProduto = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                custoTotalPorProduto[j] += matriz[4][j] * matriz[i][j];
            }
        }

        // Calculando o custo total de cada armazém
        int[] custoTotalPorArmazem = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                custoTotalPorArmazem[i] += matriz[4][j] * matriz[i][j];
            }
        }

        // Exibindo os resultados
        System.out.println("Quantidade de itens armazenados em cada armazém:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Armazém " + (i + 1) + ": " + quantidadePorArmazem[i]);
        }

        System.out.println("Armazém com maior estoque do produto 2: Armazém " + (armazemMaiorEstoqueProduto2 + 1));
        System.out.println("Armazém com menor estoque: Armazém " + (armazemMenorEstoque + 1));

        System.out.println("Custo total de cada produto:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Produto " + (j + 1) + ": " + custoTotalPorProduto[j]);
        }

        System.out.println("Custo total de cada armazém:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Armazém " + (i + 1) + ": " + custoTotalPorArmazem[i]);
        }
    }
}

