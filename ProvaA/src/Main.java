import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Número perfeito é aquele cuja soma de seus divisores, exceto ele próprio, é igual ao número.
        //Exemplo: o número 6 é perfeito porque 1 + 2 + 3 = 6. Desenvolva um método estático que receba
        //uma faixa de valores (inicio e fim) e retorne um vetor contendo todos os números perfeitos maior
        //ou igual a início e menor que fim. Modularize a sua solução criando um outro método chamado de
        //ehPerfeito(numero) que retorna true ou false caso o número seja perfeito ou não. (3,0 pts)

        int vet[] = metodo(1,9000);
        System.out.println("Numero Perfeitos: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    static int[] metodo(int inicio, int fim) {
        int contador = 0;

        for (int i = inicio; i <= fim; i++) {
            if (ehPerfeito(i)) {
                contador++;
            }
        }

        int[] vet = new int[contador];
        int j = 0;

        for (int i = inicio; i <= fim; i++) {
            if (ehPerfeito(i)) {
                vet[j] = i;
                j++;
            }
        }

        return vet;
    }

    static boolean ehPerfeito(int num) {
        int soma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

        if (soma == num) {
            return true;
        } else {
            return false;
        }
    }

}