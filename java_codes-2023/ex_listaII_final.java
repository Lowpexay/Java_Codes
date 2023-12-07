package metodos;

import java.util.Scanner;

public class ex_listaII_final {

	public static void main(String[] args) {
		String produtos [] = new String [] {"Notebook", "Computadores", "Tablets", "Servidores"}; 
		int [] metaVendas = new int [] {100, 150, 200, 250};
		Scanner entrada = new Scanner(System.in);
		//quantidade de produtos vendidos no trimestre
	    int[][] vendasPreenchidas = quantidadeProdutosVendidosTri(produtos);//faz o calculo total de produtos vendidos
		quantidadeProdutosVendidosPorLinha(vendasPreenchidas, produtos);	
		//calculo do total de vendas de todos os produtos no trimestre
		int totalVendasTrimestre = totalVendaProdutosTri(vendasPreenchidas, produtos);
		//faz a verificação se bateu a meta ou não
		String[] resultadoVerificacao = verificaMetas(metaVendas, totalVendasTrimestre);
	}

	public static int[][] quantidadeProdutosVendidosTri(String[] produtos) {
		Scanner entrada = new Scanner(System.in);
		int vendasPreenchidas [] [] = new int [4] [4]; 
		for (int i = 0; i < 4; i++) {
			System.out.println("Produto Nº "+ (i+1) +": " + produtos[i]);
			for(int j = 0; j < 4; j++) {
				System.out.println("Digite a quantidade de produtos vendidos no trimestre número "+ (j+1)+ ":");
				vendasPreenchidas[i][j] = entrada.nextInt(); 
			}
		}
		return vendasPreenchidas;
	}
	
	public static int[] quantidadeProdutosVendidosPorLinha(int[][] vendasPreenchidas, String[] produtos) {
		Scanner entrada = new Scanner(System.in);
		int totalVendasPorLinhaProduto [] = new int [4];
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                totalVendasPorLinhaProduto[i] += vendasPreenchidas[i][j];
            }
            System.out.println("Total de vendas do produto " + produtos[i] + ": " + totalVendasPorLinhaProduto[i]);
        }
		return totalVendasPorLinhaProduto;
	}
	
	public static int totalVendaProdutosTri(int[][] vendasPreenchidas, String[] produtos) {
		int totalVendasTrimestre = 0;
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j <3; j++)
                totalVendasTrimestre += vendasPreenchidas[i][j];
        }
		System.out.println("Total de vendas dos produtos: " + totalVendasTrimestre);
		return totalVendasTrimestre;
	}
	
	public static String[] verificaMetas(int[] quantidadeProdutosVendidosPorLinha, int [] metaVendas, String[] produtos, int[] totalVendasPorLinhaProduto) {
		Scanner entrada = new Scanner(System.in);
	    String[] resultadoVerificacao = new String[4];
	    System.out.println("Lista de trimestres que atingiram a meta:");
        for (int i = 0; i < 4; i++) {
            if (quantidadeProdutosVendidosPorLinha[i] >= metaVendas[i]) {
                System.out.println(resultadoVerificacao[i] + (i + 1) + " atingiu a meta.");
            } else {
                System.out.println(resultadoVerificacao[i] + (i + 1) + " não atingiu a meta.");
            }

	    }

	    // Retorna o vetor de resultado
	    return resultadoVerificacao;
	}
}
