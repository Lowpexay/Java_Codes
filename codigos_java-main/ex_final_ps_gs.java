package metodos;

import java.util.Scanner;

public class ex_final_ps_gs {

    static String[][] arrayHDados = new String[5][2];
    static int[][] arrayHNumero = new int[5][2];

    public static void main(String[] args) {
        String[] arrayNomeProduto = new String[]{"Refrigerante Lata", "Água sem gás", "Água com gás", "Suco de Laranja", "Barra de Chocolate"};
        double[] arrayPrecoProduto = new double[]{2.80, 1.90, 2.10, 2.30, 4.90};

        String[] arrayNomeServico = new String[]{"Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar"};
        double[] arrayPrecoServico = new double[]{10.50, 60.80, 42.90, 35.60, 60.40};

        // Captura de dados do cliente e tipo de hospedagem
        for (int i = 0; i < 5; i++) {
            System.out.println("Hospedagem " + (i + 1));
            arrayHDados[i][0] = capturarNomeCliente();
            arrayHDados[i][1] = capturarTipoHospedagem();
            arrayHNumero[i][0] = i + 1; // Número do quarto
            arrayHNumero[i][1] = capturarQuantidadeDiarias();
        }

        // Matriz de Consumos de Produtos
        int[][] matrizConsumoProdutos = entradaConsumoProdutos(arrayNomeProduto);

        // Matriz de Consumos de Serviços
        int[][] matrizConsumoServicos = entradaConsumoServicos(arrayNomeServico);

        // Relatório Gerencial
        gerarRelatorioGerencial(arrayHNumero, arrayHDados, matrizConsumoProdutos, matrizConsumoServicos, arrayPrecoProduto, arrayPrecoServico);
    }

    public static String capturarNomeCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        return scanner.nextLine();
    }

    public static String capturarTipoHospedagem() {
        Scanner scanner = new Scanner(System.in);
        String tipo;
        do {
            System.out.print("Digite o tipo de hospedagem (S/D/SL/SP): ");
            tipo = scanner.next().toUpperCase();
        } while (!tipo.equals("S") && !tipo.equals("D") && !tipo.equals("SL") && !tipo.equals("SP"));
        return tipo;
    }

    public static int capturarQuantidadeDiarias() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de diárias: ");
        return scanner.nextInt();
    }

    public static int[][] entradaConsumoProdutos(String[] arrayNomeProduto) {
    	Scanner scanner = new Scanner(System.in);
        int[][] matrizConsumoProdutos = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Consumo de produtos para " + arrayHDados[i][0]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Quantidade de " + arrayNomeProduto[j] + ": ");
                matrizConsumoProdutos[i][j] = scanner.nextInt();
            }
        }

        return matrizConsumoProdutos;
    }

    public static int[][] entradaConsumoServicos(String[] arrayNomeServico) {
    	Scanner scanner = new Scanner(System.in);
        int[][] matrizConsumoServicos = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Consumo de serviços para " + arrayHDados[i][0]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Quantidade de " + arrayNomeServico[j] + ": ");
                matrizConsumoServicos[i][j] = scanner.nextInt();
            }
        }

        return matrizConsumoServicos;
    }

    public static void gerarRelatorioGerencial(int[][] arrayHNumero, String[][] arrayHDados, int[][] matrizConsumoProdutos,
                                               int[][] matrizConsumoServicos, double[] arrayPrecoProduto, double[] arrayPrecoServico) {
        for (int i = 0; i < 5; i++) {
            System.out.println("\nRelatório para Hospedagem " + arrayHNumero[i][0]);
            System.out.println("Cliente: " + arrayHDados[i][0]);
            System.out.println("Tipo de Hospedagem: " + arrayHDados[i][1]);
            System.out.println("Número do Quarto: " + arrayHNumero[i][0]);
            System.out.println("Quantidade de Diárias: " + arrayHNumero[i][1]);

            // Calcula o valor da estadia
            double valorEstadia = calcularValorEstadia(arrayHDados[i][1], arrayHNumero[i][1]);
            System.out.println("Valor da Estadia: R$ " + valorEstadia);

            // Calcula o total de consumo de produtos
            double totalProduto = calcularTotalProduto(matrizConsumoProdutos[i], arrayPrecoProduto);
            System.out.println("Total de Consumo de Produtos: R$ " + totalProduto);

            // Calcula o total de consumo de serviços
            double totalServico = calcularTotalServico(matrizConsumoServicos[i], arrayPrecoServico);
            System.out.println("Total de Consumo de Serviços: R$ " + totalServico);

            // Calcula o total geral
            double totalGeral = valorEstadia + totalProduto + totalServico;
            System.out.println("Total Geral: R$ " + totalGeral);
        }
    }

    public static double calcularValorEstadia(String tipoHospedagem, int quantidadeDiarias) {
        double valorDiaria;
        switch (tipoHospedagem) {
            case "S":
                valorDiaria = 245.00;
                break;
            case "D":
                valorDiaria = 280.00;
                break;
            case "SL":
                valorDiaria = 310.00;
                break;
            case "SP":
                valorDiaria = 400.00;
                break;
            default:
                valorDiaria = 0.0;
        }
        return valorDiaria * quantidadeDiarias;
    }

    public static double calcularTotalProduto(int[] consumoProdutos, double[] arrayPrecoProduto) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += consumoProdutos[i] * arrayPrecoProduto[i];
        }
        return total;
    }

    public static double calcularTotalServico(int[] consumoServicos, double[] arrayPrecoServico) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += consumoServicos[i] * arrayPrecoServico[i];
        }
        return total;
    }
}

