/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eje2razaperro;

import Servicio.SerMascota;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Eje2RazaPerro {

    public static void main(String[] args) {
        SerMascota mas = new SerMascota();
        Scanner leer = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            mas.ingresarMascota();
            System.out.println("Desea ingresar otra raza (Si/No");
            String otro = leer.next();
            if (otro.equalsIgnoreCase("no")) {
                salir = true;

            }
        }
        //System.out.println("ssd");
        mas.mostrarMascota();
        mas.buscarRaza();
    }
}
