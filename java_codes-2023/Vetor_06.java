package Codigos;

import java.util.Scanner;

public class Vetor_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numInteiros [] = {1,2,3,4,5,10,30,78,91};
		int numMaior = numInteiros[0];
		int numMenor = numInteiros[0];
		
		for (int i = 0; i < 9; i++) {
			System.out.println("Números Inteiros: " + numInteiros[i]);
			if (numInteiros[i] > numMaior) {
	                numMaior = numInteiros[i];
	            }
	            if (numInteiros[i] < numMenor) {
	                numMenor = numInteiros[i];
	            }
		}
		
		
		System.out.println("Número maior: " + numMaior);
		System.out.println("Número menor: " + numMenor);

	}

}
