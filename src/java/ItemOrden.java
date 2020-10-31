/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopartes;

public class ItemOrden {
    private int id;
    private Orden orden;
    private Producto producto;
    private int cantidad;
    
    ItemOrden(Orden orden, Producto producto, int cantidad) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public int getId() {
        return id;
    }
    
    public Orden getOrden() {
        return orden;
    }
    
    public Producto getProducto() {
        return producto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public float getSubTotal() {
        return cantidad * producto.getPrecio();
    }
}
