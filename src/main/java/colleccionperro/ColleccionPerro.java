/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colleccionperro;

import Servicios.ServicioMascota;
import java.util.ArrayList;

/**
 *
 * @author monte
 */
public class ColleccionPerro {

    public static void main(String[] args) {
      /*  //array
        String[] nombreArray=new String[5];
        for (int i = 0; i < nombreArray.length; i++) {
            nombreArray[i]="Chiquito "+(i+1);
        }
        for (String var : nombreArray) {
            System.out.println(var);
        }
        
        //collectios
        ArrayList<String> nombreArrayList =new ArrayList();
        nombreArrayList.add("chiquito");
        nombreArrayList.add("chiquito");
       */
      
      ServicioMascota serMasc=new ServicioMascota();
      
      serMasc.crearMacota();
      serMasc.crearMacota();
      
      serMasc.mostrarMascota();
    }
}
