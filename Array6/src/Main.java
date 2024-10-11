import java.util.Random;

public class Main {

    static int[] gerarVetor(int tam, int vmin, int vmax){
        Random random = new Random();
        int v[] = new int[tam];
        for(int i = 0 ; i < tam ; i++)
            v[i] = random.nextInt((vmax-vmin) + 1) + vmin;

        return v;
    }
    static float media(int[] vet){
        int i = 0;
        float soma = 0, media;
        while(i < vet.length){
            soma += vet[i];
            i++;
        }
        media = soma/i;
        return media;

    }
    static float desvioQuadrado(int[] vet){
        float x = media(vet);
        float soma = 0;
        int i = 0;
        while(i < vet.length){
            soma += Math.pow((vet[i] - x), 2);
            i++;
        }
        return soma;
    }
    static float variancia(int[] vet){
        float v = desvioQuadrado(vet);
        v = v / (vet.length - 1);
        return v;
    }
    static double desvioPadrao(int[] vet){
        double dvp = Math.sqrt(variancia(vet));
        return dvp;
    }
    static void exibirVetor(int[] v){
        int flag = 0;
        for(int i = 0; i < v.length; i++)
            System.out.println(v[i]);

    }
    static void estatistica(int[] vet){
        float media = media(vet);
        System.out.println("O valor da média é " + media);
        float dq = desvioQuadrado(vet);
        System.out.println("O valor do desvio quadrado é " + dq);
        float var = variancia(vet);
        System.out.println("O valor da variância é " + var);
        double dvp = desvioPadrao(vet);
        System.out.println("O valor do desvio padrão é " + dvp);
    }

    public static void main(String[] args) {
        int[] vet = gerarVetor(3,-10,10);
        exibirVetor(vet);
        estatistica(vet);
    }
}