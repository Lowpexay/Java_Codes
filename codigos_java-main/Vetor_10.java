package Codigos;

import java.util.Scanner;

public class Vetor_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idades[] = new int [15];
		int somaIdades = 0;
		double mediaIdades = 0;
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Digite a idade dos participantes do evento: ");
			idades[i] = entrada.nextInt();
			somaIdades += idades[i];
		}
		
		mediaIdades = somaIdades / idades.length;
		
		System.out.println("-------- Todas as idades registradas ------------");
		for (int i = 0; i < 15; i++) {
			System.out.println(idades[i]);
		}
		System.out.println("Média de idades dos participantes do evento: " + mediaIdades);
		

	}

}
