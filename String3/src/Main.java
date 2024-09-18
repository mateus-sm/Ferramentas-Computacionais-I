import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto, textos[];
        int count = 0;

        System.out.print("Digite seu texto: ");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            count++;
        }
        System.out.printf("A palavra tem %d caracteres\n", count);

        textos = texto.split(" ");
        System.out.println(textos);
    }
}