package metodos;
import java.util.Arrays;
import java.util.Scanner;

public class ex_01_lista_II {
	    public static void main(String[] args) {
	        // Chamando o método para obter o vetor
	        int[] vetorA = obterVetor();

	        // Chamando o método para ordenar o vetor
	        int[] vetorOrdenado = ordenarVetor(vetorA);

	        // Exibindo o vetor ordenado
	        System.out.println("Vetor ordenado: " + Arrays.toString(vetorOrdenado));
	    }

	    // Método para obter o vetor a partir da entrada do usuário
	    public static int[] obterVetor() {
	        int[] vetor = new int[5];
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 5 números inteiros:");

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        return vetor;
	    }

	    // Método para ordenar o vetor e retornar o resultado
	    public static int[] ordenarVetor(int[] vetor) {
	        Arrays.sort(vetor);
	        return vetor;
	    }
	}
