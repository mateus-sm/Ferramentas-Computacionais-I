import java.util.Scanner;

public class Main {
    static String embaralhaPalavra(String palavra) {
        char[] letras = palavra.toCharArray();
        int rand;
        char temp;

        for (int i = 0; i < palavra.length(); i++) {
            rand = (int) (Math.random() * palavra.length());

            temp = letras[i];
            letras[i] = letras[rand];
            letras[rand] = temp;
        }

        return new String(letras);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.print("Digite a palavra: ");
        palavra = sc.nextLine();

        System.out.println("Palavra embaralhada: " + embaralhaPalavra(palavra));
    }
}