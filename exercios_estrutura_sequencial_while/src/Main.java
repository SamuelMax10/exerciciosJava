import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Exercicio 01

        System.out.println("Entrada: ");

        int x,y, resultado;

        x = sc.nextInt();
        y = sc.nextInt();

        resultado = x + y;

        System.out.println("SOMA = "+resultado);*/

        /*Exercicio 02

        System.out.println("Entrada: ");

        double raio, area;

        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio,2);

        System.out.printf("Área= %.4f",area);*/

        /* Exercicio 03

        System.out.println("Entrada: ");

        int a, b, c, d, calc;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        calc = a*b-c*d;

        System.out.println("DIFERENÇA: "+calc);*/

        /* Exercicio 04

        System.out.println("Entrada: ");

        int num, hrs;
        double valor,salario;

        num = sc.nextInt();
        hrs = sc.nextInt();
        valor = sc.nextDouble();
        salario = hrs * valor;

        System.out.println("NÚMERO = "+num);
        System.out.printf("SALÁRIO = %.2f",salario);*/

        /*Exercicio 05

        System.out.println("Entrada: ");

        int cod1,cod2,qtd1,qtd2;
        double valor1,valor2,pagar;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        pagar = qtd1 * valor1 + qtd2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", pagar);*/

        /* Exercicio 06
        System.out.println("Entrada: ");

        double a,b,c,tri,cir,tra,qua,ret;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        tri = a*c/2;
        cir = 3.14159*Math.pow(c,2);
        tra = (a+b)*c/2;
        qua = Math.pow(b,2);
        ret = a * b;

        System.out.printf("TRIANGULO: %.3f%n",tri);
        System.out.printf("CIRCULO: %.3f%n",cir);
        System.out.printf("TRAPEZIO: %.3f%n",tra);
        System.out.printf("QUADRADO: %.3f%n",qua);
        System.out.printf("RETANGULO: %.3f%n",ret);*/
        
        sc.close();
    }
}