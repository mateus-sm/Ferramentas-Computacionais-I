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
    static void exibirMatriz(int[][] mat, int l, int c){
        for(int i = 0; i < l ; i++) {
            for (int j = 0; j < c; j++)
                System.out.printf("%d ", mat[i][j]);

            System.out.println();
        }
    }
    static boolean verificarMaj(int[][] mat, int l, int c){
        float x = l * c / 2;
        for(int i = 0; i < l ; i++)
            for(int j = 0; j < c; j++)
                if(mat[i][j] > x)
                    return true;

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = gerarMatriz(5,5,5,10);
        exibirMatriz(mat, 5, 5);
        boolean ver = verificarMaj(mat, 5, 5);
        if(ver == true)
            System.out.println("A matriz É MAJORITARIA");
        else
            System.out.println("A matriz NÃO É MAJORITARIA");
    }
}