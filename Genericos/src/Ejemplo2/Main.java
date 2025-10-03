package Ejemplo2;

public class Main {
    public static void main(String[] args) {

        Persona<Integer> persona1 =
            new Persona<Integer>("Somos", "Hackers de la Programacion", 32);

        Persona<Double> persona2 =
            new Persona<Double>("Somos", "Hackers de la Programacion", 32.3);
    }
}