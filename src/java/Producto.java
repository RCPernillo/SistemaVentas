/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopartes;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int existencia;
    
    Producto(String nombre, String descripcion, float precio, int existencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public int getId() {
        return id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public int getExistencia() {
        return existencia;
    }
}
