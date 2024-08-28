import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desenvolva um programa que calcule a distância entre dois pontos no plano. Os valores dos pontos
        //devem ser informados pelo usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ponto Xa: ");
        double xa = sc.nextDouble();
        System.out.println("Digite o ponto Xb: ");
        double xb = sc.nextDouble();
        System.out.println("Digite o ponto Ya: ");
        double ya = sc.nextDouble();
        System.out.println("Digite o ponto Yb: ");
        double yb = sc.nextDouble();

        double resultado = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));

        System.out.println("Seu resultado é: " + resultado);
    }
}