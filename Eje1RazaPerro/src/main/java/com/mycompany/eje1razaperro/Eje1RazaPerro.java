/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eje1razaperro;

import Entidad.Mascota;
import Servicio.IngresaMascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Eje1RazaPerro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        IngresaMascota nmas = new IngresaMascota();

        boolean salir = false;
        while (!salir) {

            nmas.ingresarMascota();

            System.out.println("Desea ingresar otro perro ? (si/no)");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("no")) {
                salir = true;

            }

        }

        nmas.mostrarPerro();

    }
}
