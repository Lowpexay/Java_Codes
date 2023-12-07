package Codigos;

import java.util.Scanner;

public class Vetor_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Tamanho dos vetores
        int tamanhoVetor = 5;
        
        // Vetores para armazenar nomes, salários e tempo de serviço
        String[] nomes = new String[tamanhoVetor];
        double[] salarios = new double[tamanhoVetor];
        int[] tempoServico = new int[tamanhoVetor];
        
        // Preencher os vetores com os dados dos funcionários
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();
            
            System.out.print("Digite o tempo de serviço (em anos) do funcionário " + (i + 1) + ": ");
            tempoServico[i] = sc.nextInt();
            
            // Consumir a quebra de linha
            sc.nextLine();
        }
        
        // Relatório 1: Funcionários sem aumento
        System.out.println("Funcionários sem aumento:");
        for (int i = 0; i < tamanhoVetor; i++) {
            if (naoTemAumento(salarios[i], tempoServico[i])) {
                System.out.println(nomes[i]);
            }
        }
        
        // Relatório 2: Funcionários com aumento e seus novos salários
        System.out.println("\nFuncionários com aumento e seus novos salários:");
        for (int i = 0; i < tamanhoVetor; i++) {
            if (temAumento(salarios[i], tempoServico[i])) {
                double novoSalario = calcularNovoSalario(salarios[i], tempoServico[i]);
                System.out.println(nomes[i] + " - Novo salário: R$" + novoSalario);
            }
        }
        
        sc.close();
    }
    
    // Verifica se um funcionário tem direito a aumento
    public static boolean temAumento(double salario, int tempoServico) {
        boolean salarioAbaixo = salario < 780.0;
        boolean tempoServicoSuperior = tempoServico > 5;
        
        if (salarioAbaixo && tempoServicoSuperior) {
            return true; // Aumento de 35%
        } else if (salarioAbaixo) {
            return true; // Aumento de 15%
        } else if (tempoServicoSuperior) {
            return true; // Aumento de 25%
        } else {
            return false; // Sem aumento
        }
    }
    
    // Calcula o novo salário de acordo com as regras de aumento
    public static double calcularNovoSalario(double salario, int tempoServico) {
        if (salario < 780.0 && tempoServico > 5) {
            return salario * 1.35; // Aumento de 35%
        } else if (salario < 780.0) {
            return salario * 1.15; // Aumento de 15%
        } else if (tempoServico > 5) {
            return salario * 1.25; // Aumento de 25%
        } else {
            return salario; // Sem aumento
        }
    }
    
    // Verifica se um funcionário não tem direito a aumento
    public static boolean naoTemAumento(double salario, int tempoServico) {
        return !temAumento(salario, tempoServico);
    }
}
