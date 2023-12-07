package Codigos;

import java.util.Scanner;

public class Vetor_05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frutas [] = {"Maçã", "Pera", "Uva", "Melancia", "Abacaxi"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome da fruta Nº" + (i+1) + " " +frutas[i]);
		}

	}

}
