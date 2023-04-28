/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author monte
 */
public class SerPaises {
    private String pais;

    public SerPaises() {
    }

   
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
    
    @Override
    public String toString(){
        return "Pais {"+" Pais :"+pais+'}';
    }
    
    
}
