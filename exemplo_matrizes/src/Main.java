import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i]+" ");
        }
        System.out.println();

        int contador = 0;
        for (int i = 0; i< mat.length;i++){
            for (int j =0; j<mat[i].length; j++){
                if (mat[i][j]<0)
                    contador++;
            }
        }
        System.out.println("Numeros negativos: "+contador);

    }
}