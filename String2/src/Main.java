import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra, iniciais = "";

        System.out.print("Digite seu nome: ");
        palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            if (i == 0) {
                iniciais += palavra.charAt(0);
            } else if (palavra.charAt(i - 1) == ' ') {
                iniciais += palavra.charAt(i);
            }
        }

        System.out.println(iniciais.toUpperCase());
    }
}