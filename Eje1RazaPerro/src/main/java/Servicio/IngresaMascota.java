/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class IngresaMascota {

    Mascota nmas = new Mascota();
    ArrayList<String> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void ingresarMascota() {
        System.out.println("Ingrese el nombre de la mascota");
       nmas.setNombre(leer.next());
     //  lista.add(nmas.setNombre(leer.next()));
    // lista.set(0, new Mascota(leer.next()));
              
       lista.add(nmas.getNombre());

        System.out.println("Ingrese la raza de la mascota");
        nmas.setRaza(leer.next());

        lista.add(nmas.getRaza());

       //  lista.addAll(lista);
      
    }

    public void mostrarPerro() {
        System.out.println("Perros guardados");

        // for (int i = 0; i < lista.size(); i++) {
        
        
        for (String caden : lista) {

            System.out.print(caden+" ");
            
        }
        
    }

 
}
