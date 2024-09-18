import java.util.Scanner;

public class Main {
    static String gerarPalavra() {
        char[] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int[] tamanhoPalavra = {4, 6, 8};
        String nome = "";

        int rand = (int) (Math.random() * 3);
        int tamanho = tamanhoPalavra[rand];

        for (int i = 0; i < tamanho; i++) {

            if (i % 2 == 0) {
                rand = (int) (Math.random() * 21);
                nome += consoantes[rand];
            } else {
                rand = (int) (Math.random() * 5);
                nome += vogais[rand];
            }

        }

        return nome;
    }
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(gerarPalavra());
        }

    }
}