import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Base salarial: ");
        double baseSalarial = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));
        System.out.print("Quantos contratos para este trabalhador? ");

        int qantContratos = sc.nextInt();
        for (int i = 1; i <= qantContratos; i++) {
            System.out.println("Insira os dados do contrato nº " + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por horas: ");
            Double valorHoras = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int duracaoHoras = sc.nextInt();
            HoraContrato contrato = new HoraContrato(dataContrato, valorHoras, duracaoHoras);
            trabalhador.addContrato(contrato);
        }
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o salario (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento:" + trabalhador.getDepartamento().getNome());
        System.out.printf("Renda de %s: R$%.2f", mesEAno, trabalhador.renda(ano, mes));

        sc.close();
    }
}