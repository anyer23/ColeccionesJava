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

    ArrayList<AtriAlumno> Alumno = new ArrayList();

    

    public ArrayList<AtriAlumno> CrearAlumno() {

        do {
            System.out.println("Ingrese el nombre del alumno");
            nuevoAlumno.setNombre(leer.next());
List<Integer> notas = new ArrayList<>();
            for (int i = 1; i < 4; i++) {
                
                System.out.print("Ingrese la nota " + i + " :");
                notas.add(leer.nextInt());
                   
                leer.nextLine();//salto de linea
            }
            //agregar notasakumno al objeto alumno
            nuevoAlumno.setNotas((ArrayList<Integer>) notas);

            //crear el ojeto alumno a la lista
            AtriAlumno agalumno = new AtriAlumno(nuevoAlumno.getNombre(), (ArrayList<Integer>) nuevoAlumno.getNotas());
            Alumno.add(agalumno);
            
          
            //pregunta si desea agregar otro alumno
            System.out.println("Desea ingresar otro alumno (S/N)");

        } while (leer.nextLine().equalsIgnoreCase("S"));

        for (AtriAlumno atriAlumno : Alumno) {
            System.out.println(atriAlumno);
        }
       return Alumno;
        
    }

    public void buscarAlumno() {
        System.out.println("Ingrese el nombre del alumno a buscar");
        String alumnoBuscar = leer.nextLine();
        boolean encontrada = false;

        for (AtriAlumno alumnoEn : Alumno) {
            if (alumnoEn.getNombre().equalsIgnoreCase(alumnoBuscar)) {
                System.out.println("El alumno  " + alumnoEn.getNombre() + " si se encuenta");
               
                //System.out.println("notas"+nuevoAlumno.getNotas());
                 
                 NotaFinal(alumnoEn);
                 encontrada = true;
                 break;
            } 
            
            

        }
        if (!encontrada) {
            System.out.println("El alumno no esta en la lista ");
        }
        
    }

    public void NotaFinal(AtriAlumno alumno) {
        List<Integer> notas=nuevoAlumno.getNotas();
        
        double suma=0;
        //for (AtriAlumno atAlumno : Alumno) {
         //   if (atAlumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota: notas) {
                    suma += nota;
                  //  System.out.println(suma);
                }
         //   }
            double x= suma/notas.size();
            System.out.println("El promedio es " +x);
      //  }
        
        
    
    }
    
    
}
