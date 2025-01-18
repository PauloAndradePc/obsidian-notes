package Memoria_Array_List.Listas;

import java.util.ArrayList;
import java.util.List;

public class ListasEmJava {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        //Adicionando elemetos na minha.
        System.out.println("Adicionando elementos na lista");
        lista.add("Paulo");
        lista.add("Carlos");
        lista.add("Diomeneis");
        lista.add("Claudia");
        lista.add("Gabrielle");

        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println();

        //Removendo o elemento (Carlos) da lista.
        System.out.println("Removendo elementos da minha lista");
        lista.remove("Carlos");
        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println();

        //Inserindo um elemento entre os elementos da lista.
        System.out.println("Inserindo um elemmento entre os elementos da minha lista: ");
        lista.add(2, "Arthur");
        for (String s : lista) {
            System.out.println(s);
        }




    }

}
