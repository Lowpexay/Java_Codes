package Codigos;

import java.util.Scanner;

import java.util.Scanner;

public class Vetor_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Número de meses no ano
        int numMeses = 12;
        
        // Vetor para armazenar as temperaturas
        double[] temperaturas = new double[numMeses];
        
        // Vetor para armazenar os nomes dos meses por extenso
        String[] mesesExtenso = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        // Receber as temperaturas médias
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Digite a temperatura média de " + mesesExtenso[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }
        
        // Encontrar a maior e a menor temperatura
        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        
        for (int i = 1; i < numMeses; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                indiceMaior = i;
            }
            
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                indiceMenor = i;
            }
        }
        
        // Exibir a maior e a menor temperatura e seus meses correspondentes
        System.out.println("A maior temperatura ocorreu em " + mesesExtenso[indiceMaior] + ": " + maiorTemperatura + "°C");
        System.out.println("A menor temperatura ocorreu em " + mesesExtenso[indiceMenor] + ": " + menorTemperatura + "°C");
        
    }
}
