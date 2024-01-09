import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;
import entities.Aluguel;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*01 - Problema "negativos"
        System.out.print("Quantos numeros voce vai digitar:");

        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i=0; i< vect.length; i++){
            if (vect[i] < 0){
            System.out.printf("%d%n",vect[i]);
            }
        }*/

        /*02 - Problema "soma_vetor"
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i< vect.length;i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        System.out.print("VALORES: ");
        for (int i=0; i< vect.length; i++){
            soma+=vect[i];
            System.out.printf("%.1f  ",vect[i]);
        }

       double media = soma/ vect.length;

        System.out.printf("%nSOMA: %.2f%n",soma);
        System.out.printf("MEDIA: %.2f%n",media);*/

        /*03 - Problema "alturas"
        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        Alturas[] vect = new Alturas[n];

        double media = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Alturas(nome, idade, altura);
            media = altura / vect.length;
        }

        int cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                cont += 1;
            }
        }
        double porcen = cont * 100.0 / vect.length;

        System.out.printf("Altura media: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcen);
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }*/

        Aluguel[] quartos = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #"+ i+": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numQuarto = sc.nextInt();
            quartos[numQuarto] = new Aluguel(nome,email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i<10; i++){
            if (quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }


        sc.close();
    }
}