package main;

import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> cola;

    public Queue() {
        cola = new LinkedList<T>();
    }

    // Agregar un elemento al final de la cola
    public void enqueue(T elemento) {
        cola.addLast(elemento);
    }

    // Eliminar y devolver el elemento del frente de la cola
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return cola.removeFirst();
    }

    // Ver el elemento del frente sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return cola.getFirst();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    // Obtener el tamaño de la cola
    public int size() {
        return cola.size();
    }
}

