package metodos;

import java.util.Scanner;

public class ex_01_lista_metodos {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("------ Pousada Beira-Mar --------");
		System.out.print("Digite o nome do hóspede: ");
        String nomeHospede = entrada.nextLine();
        System.out.print("Digite o tipo de acomodação (1 - Standard, 2 - Luxo, 3 - Super Luxo): ");
        int tipoAcomodacao = entrada.nextInt();
        System.out.print("Digite a quantidade de diárias: ");
        int quantidadeDiarias = entrada.nextInt();
        
        double valorEstadia = calcularEstadia(tipoAcomodacao, quantidadeDiarias);
        solicitarFormaPagamento(valorEstadia);
	}
        
        public static double calcularEstadia(int tipoAcomodacao, int quantidadeDiarias) {
            double valorDiaria = 0;
            switch (tipoAcomodacao) {
            case 1: // Standard
                valorDiaria = 380.00;
                break;
            case 2: // Luxo
                valorDiaria = 450.00;
                break;
            case 3: // Super Luxo
                valorDiaria = 560.00;
                break;
            default:
                System.out.println("Tipo de acomodação inválido.");
                System.exit(0);
        }
            
            double valorEstadia = valorDiaria * quantidadeDiarias;
            return valorEstadia;
        }
            public static void solicitarFormaPagamento(double valorEstadia) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a forma de pagamento (V - à vista, P - a prazo): ");
                char formaPagamento = scanner.next().charAt(0);

                if (formaPagamento == 'V' || formaPagamento == 'v') {
                    // Aplicando desconto de 10% para pagamento à vista
                    double valorFinal = valorEstadia - (valorEstadia * 0.10);
                    System.out.println("Valor final (com desconto): R$" + valorFinal);
                } else if (formaPagamento == 'P' || formaPagamento == 'p') {
                    System.out.println("Valor final: R$" + valorEstadia);
                } else {
                    System.out.println("Forma de pagamento inválida.");
                }
		
	}

}
