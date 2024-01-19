import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Digite o numero de contribuinte: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte nº" + i + ":");
            System.out.print("Pessoa física ou pessoa Juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            if (ch != 'f' && ch != 'j') {
                System.out.println("Opção invalida!");
                return;
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (ch == 'f') {
                System.out.print("Despesa de saúde: ");
                double saude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, saude));
            } else {
                System.out.print("Numero de funcionario: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, funcionarios));

                System.out.println();
            }
        }
        double sum = 0.0;
        System.out.println("IMPOSTOS PAGOS:");
        for (Contribuinte contribuentes : list) {
            double contrib = contribuentes.contribuinte();
            System.out.println(contribuentes.getNome() + " : R$" + String.format("%.2f", contrib));
            sum += contrib;
        }
        System.out.println();
        System.out.println("TOTAL DE TAXA: R$" + String.format("%.2f", sum));
    }
}
