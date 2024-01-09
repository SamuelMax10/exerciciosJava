import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*EXERCICIO 01
        int N;

        System.out.println("Digite um numero:");
        N = sc.nextInt();

        if (N<0)
            System.out.println("NEGATVO.");
        else
            System.out.println("NÃO NEGATIVO.");*/

        /*EXERCICIO 02
        int N;

        System.out.println("Digite um numero:");
        N = sc.nextInt();

        if (N % 2 == 0)
            System.out.println("PAR.");
        else
            System.out.println("IMPAR.");*/

        /*EXERCICIO 03
        int A, B;

        System.out.println("Digite dois numeros inteiro:");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A%2 == 0 && B%2 ==0)
            System.out.println("SÃO MULTIPLOS.");
        else
            System.out.println("NÃO SÃO MULTIPLOS.");*/

        /*EXERCICIO 04
        int ini, fim;

        System.out.println("Que horas iniciou o jogo?");
        ini = sc.nextInt();
        System.out.println("Que horas finalizou o jogo?");
        fim = sc.nextInt();

        int duracao;
        if (ini < fim){
            duracao = fim - ini;
        }
        else {
            duracao = 24 - ini + fim;
        }

        System.out.println("O JOGO DUROU "+duracao+" HORA(s)");*/

        /*EXERCICIO 05
        int cod;
        int qt;
        double valor = 0;

        System.out.println("Gentileza digitar o codigo e a quantidade do prorduto que deseja:");
        cod = sc.nextInt();
        qt = sc.nextInt();

        if (cod == 1){
            valor = qt * 4.00;
        }
        else if (cod ==2) {
            valor = qt * 4.50;
        }
        else if (cod ==3) {
            valor = qt * 5.00;
        }
        else if (cod ==4) {
            valor = qt * 2.00;
        }
        else if (cod ==5) {
            valor = qt * 1.50;
        }
        else{
            System.out.println("O codigo do produto digitado não existe!");
        }

        System.out.printf("O valor a ser pago é de R$ %.2f",valor);*/

        /*EXERCICIO 06
        double n;

        System.out.println("Digite um número qualquer:");
        n = sc.nextDouble();

        if (n < 0.0 || n > 100){
            System.out.printf("O número %.2f fora de intervalo!",n);
        }
        else if (n <= 25){
            System.out.printf("O número %.2f esta em um intervalo de [0,25]", n);
        } else if (n >= 25 && n <= 50) {
            System.out.printf("O número %.2f esta em um intervalo de [25,50]",n);
        }
        else if (n >= 50 && n <= 75) {
            System.out.printf("O número %.2f esta em um intervalo de [50,75]",n);
        }
        else if (n >= 75) {
            System.out.printf("O número %.2f esta em um intervalo de [75,100]",n);
        }*/

        /*EXERCICIO 07
        double x;
        double y;

        System.out.println("Digite o ponto X e o ponto Y:");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x==0.0 && y==0.0){
            System.out.println("Origem");
        }
        else if (x==0.0) {
            System.out.println("Eixo Y");
        }
        else if (y==0.0){
            System.out.println("Eixo X");
        }
        else if (x>=0.1 && y>=0.1){
            System.out.println("Quadrante 01");
        }
        else if (x<=0.1 && y>=0.1) {
            System.out.println("Quadrante 02");
        }
        else if (x<=0.1 && y<=0.1){
            System.out.println("Quadrante 03");
        }
        else if (x>=0.1 && y<=0.1) {
            System.out.println("Quadrante 04");
        }*/

        /*EXERCICIO 08
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }*/


        sc.close();

    }
}