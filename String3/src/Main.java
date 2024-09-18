import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.print("Digite seu texto: ");
        texto = sc.nextLine();

        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            count++;
        }
        System.out.printf("O texto tem %d caracteres\n", count);

        String[] palavras = texto.trim().split("\\s+");
        int numPalavras = palavras.length;

        System.out.printf("O texto tem %d palavras\n", numPalavras);
    }
}