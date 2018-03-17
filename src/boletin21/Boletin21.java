/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> palabras = new ArrayList<String>();      
        Ordenacion obx = new Ordenacion();
        
        obx.pedirDatos(palabras);
        obx.ordenarArray(palabras);
        obx.escribirFichero(palabras);
        
    }
    
}
