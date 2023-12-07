package metodos;

import java.util.Scanner;

public class ex_pesquisa {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        char[] sexos = capturarSexos();
        char[] coresOlhos = capturarCoresOlhos();
        char[] coresCabelos = capturarCoresCabelos();
        int[] idades = capturarIdades();

        double mediaIdadeOlhosCastanhosCabelosPretos = calcularMediaIdadeOlhosCastanhosCabelosPretos(idades, coresOlhos, coresCabelos);
        System.out.println("A média de idade das pessoas com olhos castanhos e cabelos pretos é: " + mediaIdadeOlhosCastanhosCabelosPretos);

        int maiorIdade = encontrarMaiorIdade(idades);
        System.out.println("A maior idade entre os habitantes é: " + maiorIdade);

        int quantidadeMulheresJovens = contarMulheresJovens(sexos, idades, coresOlhos, coresCabelos);
        System.out.println("A quantidade de mulheres jovens com olhos azuis e cabelos louros é: " + quantidadeMulheresJovens);
    }

    public static char[] capturarSexos() {
        char[] sexos = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            sexos[i] = capturarCharValido("MF");
        }
        return sexos;
    }

    public static char[] capturarCoresOlhos() {
        char[] coresOlhos = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a cor dos olhos da pessoa " + (i + 1) + " (A/C): ");
            coresOlhos[i] = capturarCharValido("AC");
        }
        return coresOlhos;
    }

    public static char[] capturarCoresCabelos() {
        char[] coresCabelos = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a cor dos cabelos da pessoa " + (i + 1) + " (L/P/C): ");
            coresCabelos[i] = capturarCharValido("LPC");
        }
        return coresCabelos;
    }

    public static int[] capturarIdades() {
        int[] idades = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = entrada.nextInt();
        }
        return idades;
    }

    public static char capturarCharValido(String opcoesValidas) {
        char valor;
        do {
            valor = Character.toUpperCase(entrada.next().charAt(0));
        } while (opcoesValidas.indexOf(valor) == -1);
        return valor;
    }

    public static double calcularMediaIdadeOlhosCastanhosCabelosPretos(int[] idades, char[] coresOlhos, char[] coresCabelos) {
        int totalPessoas = 0;
        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            if (coresOlhos[i] == 'C' && coresCabelos[i] == 'P') {
                somaIdades += idades[i];
                totalPessoas++;
            }
        }

        return totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;
    }

    public static int encontrarMaiorIdade(int[] idades) {
        int maiorIdade = idades[0];
        for (int i = 1; i < 5; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }
        return maiorIdade;
    }

    public static int contarMulheresJovens(char[] sexos, int[] idades, char[] coresOlhos, char[] coresCabelos) {
        int quantidadeMulheresJovens = 0;

        for (int i = 0; i < 5; i++) {
            if (sexos[i] == 'F' && idades[i] >= 18 && idades[i] <= 35 && coresOlhos[i] == 'A' && coresCabelos[i] == 'L') {
                quantidadeMulheresJovens++;
            }
        }

        return quantidadeMulheresJovens;
    }
}

