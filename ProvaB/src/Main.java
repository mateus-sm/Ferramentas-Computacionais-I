public class Main {
    public static void main(String[] args) {
        // Considerando que uma String é um conjunto de caracteres, escreva um método estático em Java
        //que recebe duas Strings como parâmetros e verifica se estas duas Strings possuem o mesmo conjunto
        //de caracteres, retornando true caso afirmativo e false caso contrário. (2,0 pts)
        //Observação: elementos repetidos em um conjunto são levados em conta apenas uma vez, a ordem e a
        //caixa (maiúsculos e minúsculos) dos elementos não é importante. Assim, A = {A, B, C, D} é igual a B =
        //{C, A, C, B, d}.

        String A = "ABCD";
        String B = "CACBFd";

        System.out.println(metodo(A, B));

    }

    static boolean metodo(String str1, String str2){
        int flag = 0;

        for (int i = 0; i < str1.length(); i++) {
            if(!buscaChar(str1.charAt(i), str2)) {
                flag = 1;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if(!buscaChar(str2.charAt(i), str1)) {
                flag = 1;
            }
        }

        if (flag == 1) {
            return false;
        } else {
            return true;
        }
    }

    static boolean buscaChar(char a, String str) {
        int flag = 0;
        a = Character.toLowerCase(a);

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == a) {
                flag = 1;
            }
        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }

    }
}