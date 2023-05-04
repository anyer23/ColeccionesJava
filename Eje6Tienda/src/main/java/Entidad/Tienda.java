/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monte
 */
public class Tienda {
    public String nombreProducto;
    public double precioProducto;
  

    public Tienda() {
    }

    public Tienda(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
       
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

   
    
    
}
