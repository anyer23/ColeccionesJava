/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class ServicioMascota {
    private Scanner leer=new Scanner(System.in);
    private List<String> mascotas;
    
    public ServicioMascota(){
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.mascotas=new ArrayList();
    }
    
    public void crearMacota(){
        System.out.println("Introducir nombre");
        String nombre=leer.next();
        
        System.out.println("Introducir opodo");
        String apodo=leer.next();
        
        System.out.println("Introducir tipo");
        String tipo=leer.next();
        
        String mascota= nombre+" "+apodo+" "+" "+tipo;
        mascotas.add(mascota);
    }
    public void mostrarMascota(){
        System.out.println("Las mascotas actuales en la lista");
        
        for (String aux: mascotas) {
            System.out.println(aux);
        }
        System.out.println("cantidad = "+mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad){
        
        for (int i=0;i<cantidad;i++) {
            
        }
    }
}
