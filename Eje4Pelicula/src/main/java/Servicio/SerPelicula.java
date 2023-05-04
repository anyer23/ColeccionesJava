/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Atributos.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SerPelicula {

    Pelicula peli = new Pelicula();
    Scanner leer = new Scanner(System.in);

    ArrayList<Pelicula> movie = new ArrayList();

    public void ingresarPeliculas() {

        boolean op = false;

        while (!op) {

            System.out.println("Ingrese el nombre de la pelicula");
           leer.nextLine();
            peli.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la pelicula");
            peli.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion de la pelicula");
            peli.setDuracion(leer.nextInt());

            Pelicula moiv = new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion());
            movie.add(moiv);

            System.out.println("Desea agregar otra película Si/No");
            String otro = leer.next();
            if (otro.equalsIgnoreCase("n")) {
                op = true;
            }

        }
        System.out.println("Las peliculas ingresadas son ");
        System.out.println("--------------------------------------------------");
        mostarPeli();
    }

    //mostrar todas las peliculas
    public void mostarPeli() {

        for (Pelicula pel : movie) {
            System.out.println(pel.toString());
        }
    }

    public void peliculasMenor1() {
        System.out.println("--------------------------------------------------");
        System.out.println("Peliculas con duracion menor a 60 minutos");
        System.out.println("--------------------------------------------------");
        for (Pelicula peliMenor6 : movie) {
            if (peliMenor6.getDuracion() < 60) {
                System.out.println(peliMenor6.toString());
            }
        }
    }

    public void ordenMenorMayor() {
        System.out.println("------------------------------------------------");
        System.out.println("Peliculas ordenas de (de mayor a menor )");
        movie.sort(peli.ordearDes);
        mostarPeli();
    }

    public void ordenMayorMenor() {
        System.out.println("------------------------------------------------");
        System.out.println("Peliculas ordenas de (de menor a mayor)");
        movie.sort(Pelicula.ordearAse);
        mostarPeli();
    }

    public void ordenarTitulo() {
        System.out.println("---------------------------------------.----------");
        System.out.println("Titulo de peliculas ordenas de forma alfabetica");
        movie.sort(Pelicula.tituloAlfabeticamente);
        mostarPeli();
    }
    
    public void ordenaDirector(){
       System.out.println("------------------------------------------------");
        System.out.println("Director  ordenas de forma alfabetica");
        movie.sort(Pelicula.directorOrdenadp);
        mostarPeli(); 
    }
}
