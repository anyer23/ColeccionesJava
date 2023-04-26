/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Atributos.AtriAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SeAlumno {

    AtriAlumno nuevoAlumno = new AtriAlumno();
    Scanner leer = new Scanner(System.in);

    ArrayList<AtriAlumno> notasAlumno = new ArrayList();

    List<Integer> notas = new ArrayList<>();

    public void CrearAlumno() {

        do {
            System.out.println("Ingrese el nombre del alumno");
            nuevoAlumno.setNombre(leer.next());

            for (int i = 1; i < 4; i++) {
                System.out.print("Ingrese la nota " + i + " :");

                notas.add(leer.nextInt());
                leer.nextLine();//salto de linea
            }

            //crear el ojeto alumno a la lista
            AtriAlumno alumno = new AtriAlumno(nuevoAlumno.getNombre(), (ArrayList<Integer>) notas);
            notasAlumno.add(alumno);

            //pregunta si desea agregar otro alumno
            System.out.println("Desea ingresar otro alumno (S/N)");

        } while (leer.nextLine().equalsIgnoreCase("S"));

        for (AtriAlumno atriAlumno : notasAlumno) {
            System.out.println("Alumnos y notas");
            System.out.println(atriAlumno.getNombre() + atriAlumno.getNotas());

        }

    }
    
    public void buscarAlumno(){
        System.out.println("Ingrese el nombre del alumno a buscar");
        String alumnoBuscar=leer.nextLine();
        
        for (AtriAlumno BuscarAlumno : notasAlumno) {
              //  Iterator<String> busAlumno = nuevoAlumno.

        }
    }

}
