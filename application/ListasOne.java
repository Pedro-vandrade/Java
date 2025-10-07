package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasOne {
    public static void main(String[] args) {
        //criando lista
        List<String> list = new ArrayList<>();

        list.add("Vica");
        list.add("Pedro");
        list.add("Rue");
        list.add("Haroldo");
        list.add(2, "Lucy");
        // index , element

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println("-----");
      //list.removeIf(x -> x.charAt(0) == 'V');
      // list.removeIf(x -> x.charAt(0) != 'V'); // ou
       // List<String> result =  list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());

        System.out.println(list.size());
        System.out.println("-----");
        System.out.println(list.indexOf("Pedro"));
       // System.out.println(result);
        String name = list.stream().filter(x ->x.charAt(0) =='H').findFirst().orElse(null);
        System.out.println(name);


        for (String item : list) {
            System.out.println(item);
        }
    }
}

