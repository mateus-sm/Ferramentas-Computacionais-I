import java.util.Scanner;

public class Main {
    static boolean validaPlaca(String Placa) {
        return Placa.matches("[A-Z]{3}-[A-Z0-9]{4}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String placa;

        System.out.print("Digite a placa: ");
        placa = sc.nextLine();

        System.out.println(validaPlaca(placa) ? "Placa Valida" : "Placa Invalida");
    }
}