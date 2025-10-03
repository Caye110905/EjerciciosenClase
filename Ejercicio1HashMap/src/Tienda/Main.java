package Tienda;

public class Main {

    public static void main(String[] args) {

        Inventario tienda = new Inventario("Mi Tienda");

        // Agregar productos iniciales
        tienda.agregarProducto(new Producto("P001", "Laptop Dell", 800.0, Categoria.LAPTOP, 5));
        tienda.agregarProducto(new Producto("P002", "iPhone 14", 1200.0, Categoria.SMARTPHONE, 10));
        tienda.agregarProducto(new Producto("P003", "Samsung Galaxy", 900.0, Categoria.SMARTPHONE, 8));
        tienda.agregarProducto(new Producto("P004", "iPad Pro", 1100.0, Categoria.TABLET, 7));
        tienda.agregarProducto(new Producto("P005", "MacBook Air", 1300.0, Categoria.LAPTOP, 4));
        tienda.agregarProducto(new Producto("P006", "Xiaomi Pad", 400.0, Categoria.TABLET, 12));

        // Mostrar inventario inicial
        System.out.println(tienda);

        // Buscar producto existente
        System.out.println("Buscar producto P002: " + tienda.buscarProducto("P002"));

        // Buscar producto inexistente
        System.out.println("Buscar producto P999: " + tienda.buscarProducto("P999"));

        // Actualizar stock existente
        tienda.actualizarStock("P001", 3);

        // Intentar actualizar stock inexistente
        tienda.actualizarStock("P999", 5);

        // Venta normal
        tienda.venderProducto("P002", 5);

        // Venta mayor al stock
        tienda.venderProducto("P003", 20);

        // Buscar productos por categoría
        System.out.println("Productos categoría SMARTPHONE: " + tienda.productosPorCategoria(Categoria.SMARTPHONE));

        // Categoría sin productos (ejemplo forzado)
        System.out.println("Productos categoría inexistente: " + tienda.productosPorCategoria(null));

        // Mostrar inventario final
        System.out.println(tienda);
    }
}
