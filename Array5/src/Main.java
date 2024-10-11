import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static char menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("* * * * * MENU * * * * *");
        System.out.println("[A] Criar novo vetor");
        System.out.println("[B] Exibir vetor");
        System.out.println("[C] Ordenar com BubbleSort");
        System.out.println("[D] Ordenar com ShellSort");
        System.out.println("[E] Ordenar com QuickSort");
        System.out.println("[F] Ordenar com método próprio do JAVA");
        System.out.println("[0] SAIR");
        char op = scan.next().charAt(0);
        return Character.toUpperCase(op);
    }
    static int[] gerarVetor(int tam, int vmin, int vmax) {
        Random rd = new Random();
        int[] v = new int[tam];
        for(int i = 0; i < tam; i++)
            v[i] = rd.nextInt((vmax-vmin) + 1) + vmin;

        return v;
    }
    static void exibirVetor(int[] v){
        int flag = 0;
        for (int j : v) System.out.println(j);

    }
    static void arraySort(int[] v){
        Arrays.sort(v);
    }
    static void bubbleSort(int[] v){
        int x = v.length;
        int aux;
        for(int i = 0; i < x - 1; i++)
            for(int j = 0 ; j < x - 1 - i ; j++)
                if(v[j] > v[j + 1]){
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }

    }
    static void shellSort(int[] v){
        int x = v.length;
        for (int gap = x / 2; gap > 0; gap /= 2)
            for (int i = gap; i < x; i++) {
                int temp = v[i];
                int j;

                for (j = i; j >= gap && v[j - gap] > temp; j -= gap)
                    v[j] = v[j - gap];

                v[j] = temp;

            }
    }
    static void quickSort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
            /* Chamada recursiva para redivisao do vetor de elementos menores que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
            /* Chamada recursiva para redivisao do vetor de elementos maiores que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }
    }
    static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
    static int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
            /* Vai correr o vetor ate que ultrapasse o outro ponteiro ou ate que o elemento em questão seja menor que o pivô. */

            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo)
                pontEsq++;

            /* Vai correr o vetor ate que ultrapasse o outro ponteiro que o elemento em questão seja maior que o pivô. */

            while(pontDir >= pontEsq && vetor[pontDir] > pivo)
                pontDir--;


            /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores menores e maiores que o pivô foram localizados em ambos os lados. Trocar estes elementos de lado. */


            if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    public static void main(String[] args) {
        int[] vet = gerarVetor(10, 10, 50);
        long startTime;
        long endTime;
        char op;
        do{
            op = menu();
            switch(op){
                case 'A':
                    vet = gerarVetor(10, 10, 50);
                    break;
                case 'B':
                    exibirVetor(vet);
                    break;
                case 'C':
                    startTime = System.nanoTime();
                    bubbleSort(vet);
                    endTime = System.nanoTime();
                    System.out.println("Vetor ordenado com BubbleSort");
                    System.out.println("O tempo gasto foi de " + (endTime - startTime) + " nano segundos");
                    break;
                case 'D':
                    startTime = System.nanoTime();
                    shellSort(vet);
                    endTime = System.nanoTime();
                    System.out.println("Vetor ordenado com ShellSort");
                    System.out.println("O tempo gasto foi de" + (endTime - startTime) + "nano segundos");
                    break;
                case 'E':
                    startTime = System.nanoTime();
                    quickSort(vet, 0, vet.length - 1);
                    endTime = System.nanoTime();
                    System.out.println("Vetor ordenado com QuickSort");
                    System.out.println("O tempo gasto foi de " + (endTime - startTime) + " nano segundos");
                    break;
                case 'F':
                    startTime = System.nanoTime();
                    arraySort(vet);
                    endTime = System.nanoTime();
                    System.out.println("Vetor ordenado com ArraySort");
                    System.out.println("O tempo gasto foi de " + (endTime - startTime) + " nano segundos");
                    break;
            }
        }while(op != '0');
        System.out.println();
        //
    }
}