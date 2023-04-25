/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplohashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author monte
 */
public class EjemploHashSet {

    public static void main(String[] args) {
       
        HashSet <String> nombres =new HashSet<>();
        String x="Maria";
        String y="Ana";
        nombres.add(y);
        nombres.add(x);
        //mostrar elementos
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        //remover elemento
        nombres.remove(x);
        System.out.println("eliminacion de contenido");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
    }
}
