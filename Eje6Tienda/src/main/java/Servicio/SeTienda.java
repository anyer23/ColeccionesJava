/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SeTienda {

    Tienda ntienda = new Tienda();
    Scanner leer = new Scanner(System.in);

    HashMap<String, Double> listaPro = new HashMap<String, Double>();

    public void menu() {
        int op = 0;

        while (op != 5) {
            System.out.println("Que accion desea realizar");
            System.out.println("1- Ingresar producto");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar un producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- Salir ");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    guardarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostarProductos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Tiene que introducir una opción valida");
                    ;
            }

        }
    }

    public void guardarProducto() {
        System.out.println("Ingrese el nombre del producto");
        ntienda.setNombreProducto(leer.next());
        System.out.println("Ingrese el precio del producto");
        ntienda.setPrecioProducto(leer.nextInt());

        if (listaPro.containsKey(ntienda.getNombreProducto())) {
            System.out.println("No se puede ingresar el producto.El producto ya esta registrado");

        } else {
            listaPro.put(ntienda.getNombreProducto(), ntienda.getPrecioProducto());
        }
    }

   

    
    //2 formas de recorrer un Hashmap en Java, usando entrySet() o usando keySet().
//Con keySet() lo que se obtiene como indica el nombre de la función son las claves 
    //y mediante un iterador se recorre la lista de claves
    public void mostarProductos() {
    /*   //1/ String produ;
        Iterator<String> productos = listaPro.keySet().iterator();

        System.out.println("Los productos en exisencia son ");

        while (productos.hasNext()) {
            produ = productos.next();
            System.out.println(produ + " _ " + listaPro.get(produ));

        }
*/
    
    //entrySet() con la que se obtienen los elementos enteros 
    Iterator iterador=listaPro.entrySet().iterator();
   //iterator recorro el hashmap
   //se crea una variable Map.Entry para almacenar el elemento
    Map.Entry produ;
    //y con los métodos getKey() y getValue() de Map.Entry se obtienen los valores.
        while (iterador.hasNext()) {
           produ=(Map.Entry) iterador.next();
            System.out.println("producto "+produ.getKey()+" - "+" precio "+produ.getValue());
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
       String codi=leer.next();
        if (listaPro.containsKey(ntienda.getNombreProducto())) {
           listaPro.remove(ntienda.getNombreProducto());
            
        }
    }
    
    
     public void modificarPrecio() {
         System.out.println("Ingrese el producto que desea cambiar el precio");
         ntienda.setNombreProducto(leer.next());
         if (listaPro.containsKey(ntienda.getNombreProducto())) {
             System.out.println("Ingrese el precio nuevo del producto");
             listaPro.put(ntienda.getNombreProducto(), leer.nextDouble());
             
         }else{
             System.out.println("No existe el producto");
         }
        
    }
}
