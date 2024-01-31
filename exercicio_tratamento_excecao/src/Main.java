import model.entities.Conta;
import model.exception.ExecoesConta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta:");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double saque = sc.nextDouble();

            Conta conta = new Conta(numero, titular, saldo, saque);

            System.out.println();
            System.out.print("Insira o valor para saque: ");
            double valorSaque = sc.nextDouble();

            conta.saque(valorSaque);
            System.out.printf("Novo saldo: %.2f", conta.getSaldo());

        } catch (ExecoesConta e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }

}