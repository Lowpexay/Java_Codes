package Codigos;

import java.util.Scanner;

import java.util.Scanner;

public class Vetor_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanhoVetor = 10;
        
        // Vetor para armazenar os nomes
        String[] nomes = new String[tamanhoVetor];
        
        // Solicitar e armazenar os nomes das 10 pessoas
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
        
        // Solicitar o nome a ser buscado
        System.out.print("Digite um nome para busca: ");
        String nomeBusca = sc.nextLine();
        
        // Verificar se o nome está no vetor
        boolean encontrou = false;
        int posicao = -1;
        
        for (int i = 0; i < tamanhoVetor; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrou = true;
                posicao = i;
                break; // Encontrou o nome, não é necessário continuar procurando
            }
        }
        
        // Exibir o resultado
        if (encontrou) {
            System.out.println("ACHEI na posição " + posicao);
        } else {
            System.out.println("NÃO ACHEI");
        }
        
        sc.close();
    }
}

