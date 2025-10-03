package Ejemplo1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        // Declaración de los arrays
        Integer[] numerosEnteros = {1, 2, 3, 4};
        Float[] numerosFlotantesSimples = {1.5f, 2.3f, 4.7f};
        Double[] numerosFlotantes = {3.14, 6.28, 9.81};

        // Llamada para enteros
        ArrayList<Integer> listaEnteros = convertToArrayList(numerosEnteros);

        // Llamada para floats
        ArrayList<Float> listaFloat = convertToArrayList(numerosFlotantesSimples);

        // Llamada para doubles
        ArrayList<Double> listaDouble = convertToArrayList(numerosFlotantes);

        // Comprobación de que ha funcionado
        System.out.println(listaEnteros.get(0).getClass().getName());
        System.out.println(listaFloat.get(0).getClass().getName());
        System.out.println(listaDouble.get(0).getClass().getName());
    }

    public static <V> ArrayList<V> convertToArrayList(V[] array) {
        ArrayList<V> miLista = new ArrayList<>();
        for (V numero : array) {
            miLista.add(numero);
        }
        return miLista;
    }
}