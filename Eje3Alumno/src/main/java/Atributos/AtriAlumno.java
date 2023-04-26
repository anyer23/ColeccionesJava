/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monte
 */
public class AtriAlumno {
    private String nombre;
    private ArrayList<Integer> notas =new ArrayList<>(3);

    public AtriAlumno() {
    }

    public AtriAlumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    
    
    
}
