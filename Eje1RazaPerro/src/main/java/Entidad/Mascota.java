/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monte
 */
public class Mascota {
    private String nombre;
    private String raza;
    

    public Mascota() {
    }

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
     @Override
    public String toString() {
        return "Mascota{" +", nombre = "+ nombre+ ", raza=" + raza + '}';
    }
}
