import java.util.Random;

public class Main {
    static int[] gerarVetor(int x, int y, int z){
        int[] vetor = new int[x];
        int i = 0;
        int sort;
        Random rd = new Random();
        while(i < x){
            sort = rd.nextInt((z - y) + 1) + y;
            vetor[i] = sort;
            i++;
        }

        return vetor;
    }
    static void exibirVetor(int[] x){
        for(int i = 0; i < x.length; i++)
            System.out.printf("%d° Valor: %d\n", i+1, x[i]);
    }

    public static void main(String[] args) {
        int[] vet = gerarVetor(100, 10, 50);
        exibirVetor(vet);
    }
}