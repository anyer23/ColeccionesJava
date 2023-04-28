/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eje5paises;

import Entidades.Paises;

/**
 *
 * @author monte
 */
public class Eje5Paises {

    public static void main(String[] args) {
        Paises nPais=new Paises();
        
        nPais.ingresarPais();
       nPais.ordenarPaise();
       nPais.eliminarPaise();
    }
}
