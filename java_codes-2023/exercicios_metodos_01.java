package metodos;

public class exercicios_metodos_01 {

    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    public static void main(String[] args) {
        // Exemplo de uso do método
        String minhaString = "Olá, mundo!";
        int resultado = contarCaracteres(minhaString);
        System.out.println("O número de caracteres é: " + resultado);
    }
}
