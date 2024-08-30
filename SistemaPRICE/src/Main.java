import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, juros, parcela, eq, valorJ, amortizante, saldoD, jurosTotal = 0;
        int numParcelas, cont = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("  Amortização no sistema Francês de Amortização (Tabela Price)  ");
        System.out.println(" -------------------------------------------------------------- ");

        System.out.print("Digite o Montante financiado : ");
        valor = sc.nextDouble();
        System.out.print("Digite o Juros do financiamento : ");
        juros = sc.nextDouble();
        System.out.print("Digite o Numero de parcelas desejadas : ");
        numParcelas = sc.nextInt();

        System.out.println(" -------------------------------------------------------------- ");
        System.out.printf("%-13s %-17s %-14s %-13s %-12s\n", "Parcela", "Valor Parcela", "Amortização", "Juros", "Saldo Devedor");

        eq = Math.pow((1 + juros / 100), numParcelas);
        parcela = valor * ((juros / 100 * eq) / (eq - 1));

        while (cont <= numParcelas) {
            valorJ = (valor / 100) * juros;
            jurosTotal += valorJ;
            amortizante = parcela - valorJ;
            saldoD = valor - amortizante;
            System.out.printf("Nº %-13d  %-13.2f  %-13.2f  %-13.2f  %-13.2f\n", cont, parcela, amortizante, valorJ, saldoD);
            cont++;
            valor = saldoD;
        }
        System.out.printf("Total de juros pago: R$ %.2f\n", jurosTotal);
        System.out.println(" -------------------------------------------------------------- ");
    }
}