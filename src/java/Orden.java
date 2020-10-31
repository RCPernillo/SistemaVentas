/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopartes;

public class Orden {
    private int id;
    private Usuario usuario;
    private float total;
    private String direccion;
    private String nit;
    
    Orden(Usuario usuario, String direccion, String nit) {
        this.usuario = usuario;
        this.direccion = direccion;
        this.nit = nit;
    }
    
    public int getId() {
        return id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public String getNit() {
        return nit;
    }
    
    public float getTotal() {
        return total;
    }
}
