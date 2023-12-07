package metodos;

import java.util.Scanner;

public class ex_01_lista_metodos_refeito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do hóspede: ");
		String nome = entrada.next();
		System.out.println("Digite o tipo de acomodação (1 - Standard, 2 - Luxo, 3 - Super Luxo: ");
		int tipoAcomodacao = entrada.nextInt();
		System.out.println("Digite a quantidade de diárias: ");
		int qntDiarias = entrada.nextInt();
		
        double valorFinal = calculoEstadias(tipoAcomodacao, qntDiarias);
        formaPagamento(valorFinal);

	}
	
	public static double calculoEstadias(int tipoAcomodacao, int qntDiarias) {
		double valorDiaria = 0;
		switch(tipoAcomodacao) {
		case 1: 
			valorDiaria = 380; //Standard
		break;
		case 2:
			valorDiaria = 450; // Luxo
		break;
		case 3:
			valorDiaria = 560;
		break;
		default:
			System.out.println("Tipo de acomodação inválido: ");
			System.exit(0);
		}
		double valorFinal = valorDiaria * qntDiarias;
		return valorFinal;
	}
	
	public static void formaPagamento(double valorFinal) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a forma de pagamento [V] Á vista, [P] Parcelado: ");
		char pagamento = entrada.next().toLowerCase().charAt(0);
		
		if (pagamento == 'v') {
			double valorFinalComDesc = valorFinal - (valorFinal * 0.10);
			System.out.println("Valor final (com desconto): R$" + valorFinalComDesc);
		}else if (pagamento == 'p') {
			double valorFinalComDesc = valorFinal;
			System.out.println("Valor final (sem desconto): R$" + valorFinal);
		}else {
            System.out.println("Forma de pagamento inválida.");
        }
		
	}
	

}
