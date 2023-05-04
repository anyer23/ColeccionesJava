/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos;

import java.security.CodeSigner;
import java.util.Comparator;

/**
 *
 * @author monte
 */
public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas " + " Titulo: '" + titulo + "' Director:  '" + director + "' Duracion: '" + duracion + "'";
    }

    public static Comparator<Pelicula> ordearAse = (Pelicula p, Pelicula p1) -> Integer.compare(p.getDuracion(), p1.getDuracion());

    public static Comparator<Pelicula> ordearDes = (Pelicula p, Pelicula p1) -> Integer.compare(p1.getDuracion(), p.getDuracion());

    public static Comparator<Pelicula> tituloAlfabeticamente = (Pelicula o, Pelicula o1) -> o.getTitulo().compareTo(o1.getTitulo());

    /**
     *
     */
    public static Comparator<Pelicula> directorOrdenadp= (Pelicula o1, Pelicula o2) -> o1.getDirector().compareTo(o2.getDirector());
    
}
