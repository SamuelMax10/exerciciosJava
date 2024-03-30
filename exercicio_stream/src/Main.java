import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque o caminho completo do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] campos = line.split(",");
                list.add(new Employee(campos[0], campos[1], Double.parseDouble(campos[2])));
                line = br.readLine();
            }

            System.out.print("Entre com o salario: ");
            Double salary = sc.nextDouble();

            System.out.printf("Email de pessoas cujo salário seja superior a %.2f: \n",salary);
            List<String> emails = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
            emails.forEach(System.out::println);

            double soma = list.stream().filter(s -> s.getName().toUpperCase().charAt(0) == 'M').map(s -> s.getSalary()).reduce(0.0, (x, y) -> x + y);
            System.out.println("Soma do salário das pessoas cujo nome começa por 'M': " + String.format("%.2f", soma));

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();


    }


}