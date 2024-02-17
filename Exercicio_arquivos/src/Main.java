import entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produtos> list = new ArrayList<>();

        System.out.println("Entre com o caminho do arquivo: ");
        String strArquivo = sc.nextLine();

        File caminhoArquivo = new File(strArquivo);
        String strPasta = caminhoArquivo.getParent();

        boolean sucesso = new File(strPasta + "\\out").mkdir();

        String arquivoDestino = strPasta + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) { // Ira tentar ler o arquivo que esta no caminho indicado.

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produtos(nome, preco, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {

                for (Produtos item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
                    bw.newLine();
                }

                System.out.println(arquivoDestino + " -> CRIADA!");
            } catch (IOException e) {
                System.out.println("Erro ao gravar arquivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        sc.close();

    }
}