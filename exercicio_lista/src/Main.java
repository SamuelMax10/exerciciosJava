import entities.Funcionarios;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (posisao(list, id)) {
                System.out.print("Esse id ja existe, tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.println();
            Funcionarios fun = new Funcionarios(id, nome, salario);
            list.add(fun);
        }

        System.out.print("Informe o id do funcionário que terá aumento salarial: ");
        int aumento = sc.nextInt();
        Funcionarios fun = list.stream().filter(x -> x.getId() == aumento).findFirst().orElse(null);
        if (fun == null) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.print("Insira a porcentagem: ");
            double porcentagem = sc.nextDouble();
            fun.aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionarios obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }

    public static boolean posisao(List<Funcionarios> list, int id) {
        Funcionarios fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }

}