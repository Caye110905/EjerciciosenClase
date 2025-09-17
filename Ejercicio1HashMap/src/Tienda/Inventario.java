package Tienda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventario {
	private String nombre;
	HashMap<String, Producto> inventario;
	
	public Inventario(String nombre) {
		this.nombre = nombre;
		this.inventario = new HashMap<>();
	}
	
	public void agregarProducto(Producto producto) {
		inventario.put(producto.getCodigo(), producto);
	}
	
	/*
	 * public void agregarProducto(Producto producto) {
    		if (inventario.containsKey(producto.getCodigo())) {
        		System.out.println("El producto con código " + producto.getCodigo() + " ya existe en el inventario.");
    		} else {
        		inventario.put(producto.getCodigo(), producto);
        		System.out.println("Producto agregado: " + producto.getNombre());
    		}
		}
	 */
	
	
	public void actualizarStock(String codigo, int cantidad) {
		Producto producto = inventario.get(codigo);
		if(producto != null) {
			producto.setStock(producto.getStock() + cantidad);
		} else {
			System.out.println("Producto con codigo: " + codigo + "no existe en el inventario.");
		}
	}
	
	 public void venderProducto(String codigo, int cantidad) {
	        Producto producto = inventario.get(codigo);
	        if (producto != null) {
	            if (producto.getStock() >= cantidad) {
	            	producto.setStock(producto.getStock() - cantidad);
	                System.out.println("Venta realizada de " + cantidad + " unidades de " + producto.getNombre());
	            } else {
	                System.out.println("No hay suficiente stock. Stock actual: " + producto.getStock());
	            }
	        } else {
	            System.out.println("Producto con código " + codigo + " no encontrado.");
	        }
	    }
	 
	 public Producto buscarProducto(String codigo) {
	        return inventario.get(codigo);
	    }
	 
	 public List<Producto> productosPorCategoria(Categoria categoria) {
	        List<Producto> lista = new ArrayList<>();
	        for (Producto producto : inventario.values()) {
	            if (producto.getCategoria() == categoria) {
	                lista.add(producto);
	            }
	        }
	        return lista;
	    }
	 
	 public double precioTotalInventario() {
	        double total = 0;
	        for (Producto producto : inventario.values()) {
	            total += producto.valorStock();
	        }
	        return total;
	    }
	 
	 public int getTamanoInventario() {
	        return inventario.size();
	    }
	 
	 public String toString() {
	        StringBuilder sb = new StringBuilder("Inventario de la tienda:\n");
	        for (Producto producto : inventario.values()) {
	            sb.append(producto).append("\n");
	        }
	        sb.append("Valor total inventario: ").append(precioTotalInventario()).append("\n");
	        return sb.toString();
	    }
}
