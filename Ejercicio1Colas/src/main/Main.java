package main;

public class Main {
    public static void main(String[] args) {

        Queue<String> colaClientes = new Queue<String>();

        // Agregar clientes a la cola
        colaClientes.enqueue("Cliente 1");
        colaClientes.enqueue("Cliente 2");
        colaClientes.enqueue("Cliente 3");

        System.out.println("Tamaño de la cola: " + colaClientes.size());
        System.out.println("Cliente al frente: " + colaClientes.peek());

        // Atender al cliente del frente
        String clienteAtendido = colaClientes.dequeue();
        System.out.println("Cliente atendido: " + clienteAtendido);

        System.out.println("Nuevo tamaño de la cola: " + colaClientes.size());
        System.out.println("Nuevo cliente al frente: " + colaClientes.peek());
    }
}

