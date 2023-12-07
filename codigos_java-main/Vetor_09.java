package Codigos;

import java.util.Scanner;

public class Vetor_09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String itens [] = new String [10];
		double valores [] = new double [10];
		double total = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome do " + (i+1) + " produto: ");
			itens[i] = entrada.next();
			System.out.println("Digite o preço do(a) " + (itens[i]) + ":");
			valores[i] = entrada.nextDouble();		
			total += valores[i];
			}
	
		System.out.println("-----------Lista de Compras----------");
        for (int i = 0; i < 10; i++) {
            System.out.println(itens[i] + ": R$" + valores[i]);
        }
        System.out.println("Valor Total das Compras: R$" + total);
		
	}

}
