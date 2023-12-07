package Codigos;

import java.util.Scanner;

public class Matriz_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defina as constantes para o número de produtos e lojas
        final int NUM_PRODUTOS = 5;
        final int NUM_LOJAS = 4;

        // Crie os vetores e matrizes para armazenar nomes, preços, custos de transporte e impostos
        String[] nomesProdutos = new String[NUM_PRODUTOS];
        double[][] precosProdutos = new double[NUM_PRODUTOS][NUM_LOJAS];
        double[] custoTransporte = new double[NUM_PRODUTOS];
        double[][] impostosProdutos = new double[NUM_PRODUTOS][NUM_LOJAS];

        // Preencha o vetor de nomes dos produtos
        System.out.println("Preencha o vetor com os nomes dos produtos:");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            nomesProdutos[i] = input.nextLine();
        }

        // Preencha a matriz de preços dos produtos em cada loja
        System.out.println("Preencha a matriz de preços dos produtos em cada loja:");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            for (int j = 0; j < NUM_LOJAS; j++) {
                System.out.print("Preço do produto " + nomesProdutos[i] + " na loja " + (j + 1) + ": R$");
                precosProdutos[i][j] = input.nextDouble();
            }
        }

        // Preencha o vetor de custos de transporte
        System.out.println("Preencha o vetor com os custos de transporte dos produtos:");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.print("Custo de transporte do produto " + nomesProdutos[i] + ": R$");
            custoTransporte[i] = input.nextDouble();
        }

        // Calcule os impostos de acordo com a tabela e preencha a matriz de impostos
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            for (int j = 0; j < NUM_LOJAS; j++) {
                double preco = precosProdutos[i][j];
                if (preco <= 50.00) {
                    impostosProdutos[i][j] = preco * 0.05;
                } else if (preco <= 100.00) {
                    impostosProdutos[i][j] = preco * 0.10;
                } else {
                    impostosProdutos[i][j] = preco * 0.20;
                }
            }
        }

        // Mostre o relatório
        System.out.println("Relatório:");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            for (int j = 0; j < NUM_LOJAS; j++) {
                double imposto = impostosProdutos[i][j];
                double preco = precosProdutos[i][j];
                double precoFinal = preco + imposto + custoTransporte[i];

                System.out.println("Produto: " + nomesProdutos[i]);
                System.out.println("Loja: " + (j + 1));
                System.out.println("Imposto a pagar: R$" + imposto);
                System.out.println("Custo de transporte: R$" + custoTransporte[i]);
                System.out.println("Preço: R$" + preco);
                System.out.println("Preço final: R$" + precoFinal);
                System.out.println();
            }
        }
    }
}

