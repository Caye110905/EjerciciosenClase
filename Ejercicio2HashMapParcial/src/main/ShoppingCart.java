package main;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    // Atributos
    private HashMap<String, Integer> cart;
    private HashMap<String, Double> prices;

    public ShoppingCart() {
        this.cart = new HashMap<>();
        this.prices = new HashMap<>();

        // Productos y precios
        this.prices.put("manzana", 0.50);
        this.prices.put("platano", 0.30);
        this.prices.put("naranja", 0.60);
        this.prices.put("leche", 2.50);
        this.prices.put("pan", 1.50);
    }

    // Método 1: añadir producto al carrito (10 puntos)
    public void addProduct(String nombre, int cantidad) {
        if (!prices.containsKey(nombre)) {
            System.out.println("Producto no disponible en la tienda.");
            return;
        }

        int actual = cart.getOrDefault(nombre, 0);
        cart.put(nombre, actual + cantidad);
        System.out.println("Agregado " + cantidad + " " + nombre + "(s) al carrito");
    }

    // Método 2: eliminar producto del carrito (10 puntos)
    public void removeProduct(String nombre) {
        cart.remove(nombre);
        System.out.println("Eliminado " + nombre + " del carrito.");
    }

    // Método 3: actualizar cantidad (10 puntos)
    public void updateQuantity(String nombre, int cantidad) {
        if (cantidad <= 0) {
            cart.remove(nombre);
            System.out.println("Eliminado " + nombre + " del carrito.");
        } else if (cart.containsKey(nombre)) {
            cart.put(nombre, cantidad);
            System.out.println("Actualizado " + nombre + " cantidad a " + cantidad);
        } else {
            System.out.println("Producto no se ha encontrado en el carrito.");
        }
    }

    // Método 4: mostrar contenido del carrito (10 puntos)
    public void displayCart() {
        System.out.println("\nContenido del carrito:");
        System.out.println("---------------------");

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = prices.get(producto);
            double totalProducto = precioUnitario * cantidad;
            System.out.println(producto + "- Cantidad: " + cantidad + "- Precio: $" + String.format("%.2f", totalProducto));
        }

        double total = calcularTotal();
        System.out.println("\nTotal: $" + String.format("%.2f", total));
    }

    // Método 5: calcular total del carrito con posible descuento (10 puntos)
    public double calcularTotal() {
        double total = 0.0;

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String producto = entry.getKey();
            
            int cantidad = entry.getValue();
            double precioUnitario = prices.get(producto);
            double subtotal = precioUnitario * cantidad;

            // Aplica 10% de descuento si el producto supera los 20 euros
            if (subtotal > 20.0) {
                subtotal = subtotal * 0.9; // aplica 10% de descuento
            }

            total += subtotal;
        }

        // Redondeamos a 2 decimales
        return Math.round(total * 100.0) / 100.0;
    }

    // Método main de prueba (ya dado en el examen)
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("manzana", 3);
        cart.addProduct("leche", 2);
        cart.addProduct("pan", 1);
        cart.displayCart();

        cart.updateQuantity("manzana", 5);
        cart.removeProduct("pan");
        cart.displayCart();

        cart.addProduct("chocolate", 1);
        cart.addProduct("naranja", 10);
        cart.displayCart();
    }
}

