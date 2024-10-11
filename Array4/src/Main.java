import java.util.Random;

public class Main {
    static int[][] gerarMatriz(int l, int c, int min, int max){
        int mat[][] = new int[l][c];
        Random random = new Random();

        for(int i = 0; i < l ; i++)
            for(int j = 0; j < c; j++)
                mat[i][j] = random.nextInt((max - min) + 1) + min;

        return mat;
    }
    static int[] guardaValores(int[][] mat, int l, int c){
        int[] vet = new int[l*c];
        int cont = 0;
        //pares
        for(int i = 0; i < l; i++)
            for(int j = 0; j < c; j++)
                if(mat[i][j] % 2 == 0){
                    vet[cont] = mat[i][j];
                    cont++;
                }
        //impares
        for(int i = 0; i < l; i++)
            for(int j = 0; j < c; j++)
                if(mat[i][j] % 2 != 0){
                    vet[cont] = mat[i][j];
                    cont++;
                }

        return vet;
    }
    static void exibirVetor(int[] v){
        int flag = 0;
        for(int i = 0; i < v.length; i++){
            if(i == 0)
                System.out.println("Pares: ");
            else if(v[i] % 2 != 0 && flag == 0){
                System.out.println("Impares: ");
                flag = 1;
            }
            System.out.println(v[i]);
        }
    }
    static void exibirMatriz(int[][] mat, int l, int c){
        for(int i = 0; i < l ; i++) {
            for (int j = 0; j < c; j++)
                System.out.printf("%d ", mat[i][j]);

            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        int[][] mat = gerarMatriz(5,5,5,10);
        exibirMatriz(mat, 5, 5);
        System.out.println("---------------");
        int[] vet = guardaValores(mat, 5, 5);
        exibirVetor(vet);
    }
}