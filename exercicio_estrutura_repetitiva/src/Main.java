import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*EXERCICIO 01
        System.out.println("Digite a senha: ");

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");*/

        /*EXERCICIO 02
        System.out.println("Digite a cordenada x e y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante.");
            } else {
                System.out.println("Quarto quadrante.");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }*/

        /*EXERCICIO 03
        System.out.println("Digite o tipo de combustivel que você deseja abastecer:");
        int comb = sc.nextInt();
        int alg = 0;
        int gas = 0;
        int die = 0;

        while (comb != 4) {
            if (comb == 1) {
                alg += 1;
            } else if (comb == 2) {
                gas += 1;
            } else if (comb == 3) {
                die += 1;
            }
            comb = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alg);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);*/

        sc.close();
    }
}