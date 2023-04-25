/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemploarraylist;

import entidad.Persona;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class EjemploArrayList {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Persona npe = new Persona();
        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1, "Luis", 30));
        lista.add(new Persona(2, "Maria", 3));
        lista.add(new Persona(3, "Jose", 20));
        lista.add(new Persona(4, "Ana", 31));

        /* 
        for(int i=0;i<lista.size();i++){
             System.out.println("prueba "+lista.get(i).getNombre());
        }
         */
        //recorrido por for each
        for (Persona perso : lista) {
            System.out.println("PErsona " + perso.getNombre()+" "+perso.getEdad());
        }
    }
    
    

}
