import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira a quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto nº" + i);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();

            if (ch == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                list.add(new ProdutoUsado(nome, preco, data));
            } else if (ch == 'i') {
                System.out.print("Taxa alfandegária: ");
                double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa));
            } else {
                list.add(new Produto(nome, preco));
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("ETIQUETA DE PREÇO: ");
        for (Produto pro : list) {
            System.out.println(pro.etiquetaPreco());
        }

        sc.close();

    }
}
