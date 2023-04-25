/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SerMascota {

    Mascota nmas = new Mascota();
    ArrayList<String> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);
    boolean encon = false;

    public void ingresarMascota() {
        System.out.println("Ingrese raza de mascotas");
        nmas.setRaza(leer.next());
        lista.add(nmas.getRaza());

    }

    public void mostrarMascota() {
        System.out.println(" ");
        System.out.println("Raza guardadas");
        for (String raz : lista) {
            System.out.println(raz);
        }
    }

    public void buscarRaza() {
        System.out.println("Ingrese la raza a eliminar");
        nmas.setOtraRaz(leer.next());
        //lista.add(nmas.getOtraRaz());

        Iterator<String> rRaza = lista.iterator();

        while (rRaza.hasNext()) {

            if (rRaza.next().equals(nmas.getOtraRaz())) {
                rRaza.remove();
                encon = true;
            }
        }
        System.out.println(" ");
        if (encon) {
            System.out.println("Raza eliminada");
        } else {
            System.out.println("La raza no se encuetra en la lista");
        }

        //lista ordenada con collections
        Collections.sort(lista);
        for (String perro : lista) {
            System.out.println(perro);
        }
    }
}
