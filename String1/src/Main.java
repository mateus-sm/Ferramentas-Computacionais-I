import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
        //a) O número de caracteres da string.
        //b) A string com todas suas letras em maiúsculo.
        //c) O número de vogais da string.
        //d) Se a string digitada começa com “UNO” (ignorando maiúsculas/minúsculas).
        //e) Se a string digitada termina com “STE” (ignorando maiúsculas/minúsculas).
        //f) O número de dígitos (0 a 9) da string.
        //g) Se a string é um palíndromo ou não.

        Scanner sc = new Scanner(System.in);
        String palavra;
        int vogal = 0;

        System.out.print("Digite sua palavra: ");
        palavra = sc.next();

        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            contador++;
        }
        System.out.printf("A palavra \"%s\" tem %d caracteres\n", palavra, contador);

        System.out.printf("A palavra \"%s\" em maiúsculo é: %s\n", palavra, palavra.toUpperCase());

        for (int i = 0; i < palavra.length(); i++) {
            switch (palavra.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    vogal++;
                break;
            }
        }
        System.out.printf("A palavra \"%s\" tem %d vogais\n", palavra, vogal);

        if (palavra.substring(0, 3).equalsIgnoreCase("UNO")) {
            System.out.printf("A palavra \"%s\" Começa com \"UNO\"\n", palavra);
        } else {
            System.out.printf("A palavra \"%s\" Não começa com \"UNO\"\n", palavra);
        }

        if (palavra.substring(contador - 3, contador).equalsIgnoreCase("STE")) {
            System.out.printf("A palavra \"%s\" Termina com \"STE\"\n", palavra);
        } else {
            System.out.printf("A palavra \"%s\" Não Termina com \"STE\"\n", palavra);
        }

        if (palavra.length() > 9) {
            System.out.printf("Os caracteres de 0 a 9 da palavra \"%s\" são: %s\n", palavra, palavra.substring(0, 9));
        }

        boolean palindromo = true;
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.printf("A palavra \"%s\" é palindromo", palavra);
        } else {
            System.out.printf("A palavra \"%s\" nao é palindromo", palavra);
        }
    }
}