import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um programa Java que solicite um valor real (double) ao usuário e simule o comportamento de
        //um caixa eletrônico, ou seja, calcule qual o menor número possível de notas de 100, 50, 20, 10, 5, 2 e
        //moedas de 1 real, 50, 25, 10, 5 e 1 centavos em que o valor possa ser decomposto. Seu programa
        //deverá exibir uma saída parecida com:
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.print("Digite seu valor: ");
        valor = sc.nextDouble();
        //System.out.println(valor);

        //int cem = (int)valor / 100;
        System.out.println("Nota(s) de 100: " + (int)valor / 100);
        valor -= ((int)valor / 100) * 100;

        System.out.println("Nota(s) de 50: " + (int)valor / 50);
        valor -= ((int)valor / 50) * 50;

        System.out.println("Nota(s) de 20: " + (int)valor / 20);
        valor -= ((int)valor / 20) * 20;

        System.out.println("Nota(s) de 10: " + (int)valor / 10);
        valor -= ((int)valor / 10) * 10;

        System.out.println("Nota(s) de 5: " + (int)valor / 5);
        valor -= ((int)valor / 5) * 5;

        System.out.println("Nota(s) de 2: " + (int)valor / 2);
        valor -= ((int)valor / 2) * 2;

        System.out.println("Moeda(s) de 1: " + (int)valor / 1);
        valor -= ((int)valor / 1) * 1;

        System.out.println("Moeda(s) de 0.50: " + (int)(valor / 0.50));
        valor -= (int)(valor / 0.50) * 0.50;

        System.out.println("Moeda(s) de 0.25: " + (int)(valor / 0.25));
        valor -= (int)(valor / 0.25) * 0.25;

        System.out.println("Moeda(s) de 0.10: " + (int)(valor / 0.10));
        valor -= (int)(valor / 0.10) * 0.10;

        System.out.println("Moeda(s) de 0.05: " + (int)(valor / 0.05));
        valor -= (int)(valor / 0.05) * 0.05;

        valor += 0.001;
        System.out.println("Moeda(s) de 0.01: " + (int)(valor / 0.01));
        valor -= (int)(valor / 0.01) * 0.01;
        //System.out.println(valor);
    }
}