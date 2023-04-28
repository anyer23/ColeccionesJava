/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Servicio.SerPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Paises {

    SerPaises paises = new SerPaises();

    HashSet<String> listaP = new HashSet<>();

    Scanner leer = new Scanner(System.in);

    public void ingresarPais() {
        boolean op = false;
        while (!op) {
            System.out.println("Ingrese el nombre del pais");
            paises.setPais(leer.next());
            //agregar a la lista
            listaP.add(paises.getPais());
            System.out.println("Desea agregar otro pais (si/no)");
            String otro = leer.next();

            if (otro.equalsIgnoreCase("n")) {

                mostrarPais();
                op = true;
            }

        }

    }

    public void mostrarPais() {
        for (String paises1 : listaP) {
            System.out.println("Pais : " + paises1);
        }
    }

    public void ordenarPaise() {
        System.out.println("Los paise ingresados son " + listaP);

        System.out.println("Paises ordenados alfabeticamente");

        ArrayList<String> listapai = new ArrayList<String>(listaP);
        Collections.sort(listapai);

        for (String ordenPa : listapai) {
            System.out.println(ordenPa);
        }

    }

    public void eliminarPaise() {
        boolean encont = false;
        System.out.println("Ingrese un pais a eliminar");
        String eliPais = leer.next();
        
        
        Iterator<String> rpais = listaP.iterator();
        while (rpais.hasNext()) {

            if (rpais.next().equals(eliPais)) {
                rpais.remove();
                encont = true;
            }
        }
        System.out.println(" ");
        if (encont) {
            System.out.println("Pais eliminada");
        } else {
            System.out.println("El pais no se encuetra en la lista");
        }

        System.out.println("Paises despues de eliminar a  "+eliPais);
        for (String ordenPa : listaP) {
            System.out.println(ordenPa);
        }

    }
}
