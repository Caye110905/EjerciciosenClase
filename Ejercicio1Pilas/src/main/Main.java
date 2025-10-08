package main;

public class Main {
    public static void main(String[] args) {

        Stack<String> pilaLibros = new Stack<String>();

        // Agregar libros a la pila
        pilaLibros.push("Libro 1");
        pilaLibros.push("Libro 2");
        pilaLibros.push("Libro 3");

        System.out.println("Tamaño de la pila: " + pilaLibros.size());
        System.out.println("Libro superior: " + pilaLibros.peek());

        // Eliminar el libro superior
        String libroEliminado = pilaLibros.pop();
        System.out.println("Libro eliminado: " + libroEliminado);

        System.out.println("Nuevo tamaño de la pila: " + pilaLibros.size());
        System.out.println("Nuevo libro superior: " + pilaLibros.peek());
    }
}
