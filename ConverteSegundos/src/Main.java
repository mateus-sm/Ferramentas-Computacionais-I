import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg, horas, min;

        System.out.println("Digite a quantidade de segundos: ");
        seg = sc.nextInt();

        min = seg / 60;
        seg = seg - min * 60;
        horas = min / 60;
        min = min - horas * 60;
        System.out.println(horas +" Horas " + min + " Minutos " + seg + " Segundos");
    }
}