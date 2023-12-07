package Codigos;

import java.util.Scanner;

public class Vetor_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double temp [] = new double [14];
		double totalTemp = 0;
		double mediaTemp = 0;
		
		for (int i = 0; i < 14; i++) {
			System.out.println("Digite a temperatura do " + (i + 1) + " dia: ");
			temp[i] = entrada.nextDouble();
			totalTemp += temp[i];
		}
		System.out.println("-------------- Temperaturas --------------");
		for (int i = 0; i < 14; i++) {
			System.out.println("Temperatura do " + (i + 1) + " dia: " + temp[i]);
		}
		
		mediaTemp = totalTemp / temp.length;
		
		System.out.println("Médias das temperaturas dos 14 dias: " + mediaTemp);
		
	}

}
