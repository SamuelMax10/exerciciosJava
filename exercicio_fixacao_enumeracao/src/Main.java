import entities.Cliente;
import entities.ItemOrdem;
import entities.Ordem;
import entities.Produto;
import entities.enums.StatusOrdem;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ItemOrdem itemOrdem = new ItemOrdem();
        Produto produto = new Produto();

        System.out.println("Entre com dado do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());
        System.out.println("Insira os dados do pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        Ordem ordem = new Ordem(StatusOrdem.valueOf(status));
        Cliente cliente = new Cliente(nome,email,dataNascimento);
        System.out.print("Quantos itens para este pedido? ");
        int quantidadeItens = sc.nextInt();


        for (int i = 1; i <= quantidadeItens; i++ ){
            System.out.println("Insira os dados do item nº:"+i);
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            itemOrdem = new ItemOrdem(quantidade,precoProduto);
            produto = new Produto(nomeProduto,precoProduto);
        }

        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(ordem);

        sc.close();





    }
}