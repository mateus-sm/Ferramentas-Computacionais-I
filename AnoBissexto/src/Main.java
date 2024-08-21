import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //boolean X;

        System.out.println("Digite um ano: ");

        int ano = sc.nextInt();
        //System.out.printf("Ano: %d", ano);

        //Um ano é bissexto se for divisível por 4, mas não por 100. Um ano também é bissexto se for divisível por
        //400

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Ano Bissexto!");
            //X = true;
        } else {
            System.out.println("Ano não Bissexto!");
            //X = false;
        }
    }
}