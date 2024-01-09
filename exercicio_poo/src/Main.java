//import entitites.Retangulo;
//import entitites.Funcionario;
//import entitites.Estudante;

//import entitites.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*EXERCICIO 01
        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a largura e a altura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n",retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());*/

        /*EXERCICIO 02
        Funcionario funcionario = new Funcionario();
        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        funcionario.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Funcionario: "+funcionario);
        System.out.println();
        System.out.print("Qual percentual para aumentar o salário? ");
        double porcen = sc.nextDouble();
        funcionario.aumentarSalario(porcen);
        System.out.println();
        System.out.println("Dados atualizados: "+funcionario);*/

        /*EXERCICIO 03
        Estudante estudante = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        estudante.trimestre();*/

        sc.close();
    }
}