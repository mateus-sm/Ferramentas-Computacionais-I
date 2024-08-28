import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um programa em Java que determine qual é a idade que o usuário faz no ano atual. Para isso
        //solicite o ano de nascimento do usuário. O ano atual deve ser recuperado do sistema (pesquise pelo
        //uso de LocalDate).
        LocalDate localDate = LocalDate.now();
        int ano = localDate.now().getYear();
        Scanner sc = new Scanner(System.in);
        int anoNasc, idade;

        System.out.println("Digite o ano em que voce nasceu: ");
        anoNasc = sc.nextInt();

        idade = ano - anoNasc;
        System.out.println("Voce tem " + idade + " anos");
    }
}