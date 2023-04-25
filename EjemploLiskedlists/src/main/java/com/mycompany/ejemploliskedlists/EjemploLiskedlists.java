/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemploliskedlists;

import Entidad.Persona;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author monte
 */
public class EjemploLiskedlists {

    public static void main(String[] args) {
        List<Persona> listaLinked = new LinkedList<>();

        listaLinked.add(new Persona(1, "Luis", 30));
        listaLinked.add(new Persona(2, "Ana", 50));
        listaLinked.add(new Persona(3, "Reyna", 25));
        listaLinked.add(new Persona(4, "Hector", 3));

        for (Persona persona : listaLinked) {
            System.out.println("Prueba " + persona.getNombre());
        }
        
        //eliminar 
        listaLinked.remove(1);//elimina el contenido de la posicion 0
        for (Persona persona : listaLinked) {
            System.out.println(persona.getNombre());
        }

    }
}
