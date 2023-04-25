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

    private String raza;
    private String otraRaz;//variable usada para eliminar

    public Mascota() {
    }

    public Mascota(String raza, String otraing) {
        this.raza = raza;
        this.otraRaz = otraing;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getOtraRaz() {
        return otraRaz;
    }

    public void setOtraRaz(String otraRaz) {
        this.otraRaz = otraRaz;
    }

}
