package main;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> pila;

    public Stack() {
        pila = new ArrayList<T>();
    }

    // Agregar un elemento a la cima de la pila
    public void push(T elemento) {
        pila.add(elemento);
    }

    // Eliminar y devolver el elemento superior de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.remove(pila.size() - 1);
    }

    // Ver el elemento superior sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.get(pila.size() - 1);
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Obtener el tamaño de la pila
    public int size() {
        return pila.size();
    }
}

