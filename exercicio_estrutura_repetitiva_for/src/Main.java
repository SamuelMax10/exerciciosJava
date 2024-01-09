import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Object math;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        /*EXERCICIO 01
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/

        /*EXERCICIO 02
        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i=0;i<N;i++ ){
            int x = sc.nextInt();
            if (x>=10 && x<=20){
                in+=1;
            }
            else {
                out+=1;
            }
        }
        System.out.println(in +" in");
        System.out.println(out + " out");*/

        /*EXERCICIO 03
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10.0;

            System.out.printf("%.1f", media);
        }*/

        /*EXERCICIO 04
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("Divisão impossivel!");
            } else {
                double div = n1 / n2;
                System.out.printf("%.1f", div);
            }
        }*/

        /*EXERCICIO 05
        int n = sc.nextInt();
        int x = 1;

        for (int i = 1; i <= n; i++) {
            x *= i;

        }
        System.out.println(x);*/

        /*EXERCICIO 06
        int n = sc.nextInt();

        for (int i = 1; i <=n;i++){
            if (n%i == 0){
                System.out.println(i);
            }
        }*/

        /*EXERCICIO 07
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int primeiro = i;
            int segundo = i*i;
            int terceiro  = i*i*i;
            System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);
    }*/

        sc.close();


    }
}