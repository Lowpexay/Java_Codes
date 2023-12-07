package metodos;

import java.util.Scanner;

public class ex_01_metodos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("------ Calculadora --------");

		int opcao = 0;
		
		while (opcao != 5) {
			System.out.println("Adição [1]: ");
			System.out.println("Subtração [2]: ");
			System.out.println("Multiplicação [3]: ");
			System.out.println("Divisão [4]: ");
			System.out.println("Sair [5]: ");
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1: soma();
			break;
			case 2: sub();
			break;
			case 3: mult();
			break;
			case 4: div();
			break;
			case 5: System.exit(0);
			break;
			default:
				System.out.println("Opção inválida - tenta novamente: ");
			}
		}
		
	}
	
	public static void soma() {
		int n1 = 0;
		int n2 = 0;
		System.out.println("Adição");
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		int somaNum = n1 + n2;
		System.out.println("O resultado da soma é: " + somaNum);
	}
	public static void sub() {
		int n1 = 0;
		int n2 = 0;
		System.out.println("Subtração");
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		int subNum = n1 - n2;
		System.out.println("O resultado da subtração é: " + subNum);
	}
	public static void mult() {
		int n1 = 0;
		int n2 = 0;
		System.out.println("Multiplicação");
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		int multNum = n1 * n2;
		System.out.println("O resultado da multiplicação é: " + multNum);
	}
	public static void div() {
		int n1 = 0;
		int n2 = 0;
		System.out.println("Divisão");
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		
		int divNum = n1 / n2;
		System.out.println("O resultado da divisão é: " + divNum);
	}
	

}
