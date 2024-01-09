import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); //Foi adicionado um nome na posição 2 da lista.

        System.out.println(list.size());//Tamanho da lista

        for (String x : list) { //Para cada objeto 'x' contido em list, faça:
            System.out.println(x);
        }
        System.out.println("-----------------------------");
//        list.remove("Marco");
//        System.out.println(list);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        System.out.println("Indice do Bob: "+ list.indexOf("Bob"));
        System.out.println("Indice do Marco: "+ list.indexOf("Marco"));

        System.out.println("-----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
    }
}