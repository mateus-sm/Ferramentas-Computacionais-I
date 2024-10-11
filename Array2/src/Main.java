public class Main {

    static void inicializarMatriz(int mat[][]){
        int cont = 1;
        for(int i = 0; i < 3 ; i++)
            for(int j = 0; j < 3 ; j++){
                mat[i][j] = cont;
                cont++;
            }
    }

    static void exibirMatriz(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++)
                System.out.printf("%d ", mat[i][j]);
            System.out.printf("\n");
        }
    }

    static void fatorialMatriz(int mat[][]){
        int fatorial;
        for(int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat.length; j++) {
                fatorial = 1;
                for (int k = 1; k <= mat[i][j]; k++) {
                    fatorial = fatorial * k;
                }
                mat[i][j] = fatorial;
            }

    }

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        inicializarMatriz(mat);
        exibirMatriz(mat);
        System.out.printf("-------------------\n");
        fatorialMatriz(mat);
        exibirMatriz(mat);
    }
}