import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Desenvolva um programa em Java que leia um número inteiro qualquer (use long), calcule e apresente
        //a soma de todos os seus dígitos. Exemplo: 1234 a soma dos dígitos é 10. Não use Strings ou vetores
        //para a resolução.

        Scanner sc = new Scanner(System.in);

        long numero = sc.nextLong();
        long soma = 0;
        int mult = 10;

        long dig = numero % 10;
        while (dig > 1) {
            soma += dig;
            numero -= dig;
            mult *= 10;
            //System.out.println(dig);

            dig = numero % mult;
            while (dig > 10){
                dig = dig / 10;
            }
        }
        soma += dig;

        System.out.println("Soma dos digitos: " + numero + " é igual a: " + soma);


    }
}