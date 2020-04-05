    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocvirtual;

import CLase.CA;
import CLase.CB;
import Clase2.CD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Herberth
 */
public class EjercicioCVirtual {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList CA = new ArrayList<>();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            
        CB a = new CB(1, 2, 3);
        CD d = new CD(1, 2);
        CA ca = new CA(1, 3);
        
        System.out.println("La suma es " + a.sumar());
        System.out.println("La suma es " + d.suma());
        System.out.println("La suma es " + ca.sumar());
        System.out.println("La multiplicacion es " + ca.multi());
        
        System.out.println("El valor mayor es " + ca.mayor());
        
        ArrayList<CA> Clase1 = new ArrayList<CA>();
        Clase1.add(new CA(8, 5));
        Clase1.add(new CA(7, 5));
        Clase1.add(new CA(2, 4));
        Clase1.add(new CA(45, 78));
        
        
        
                
        
        
        for (CA auxiliar : Clase1) {
            System.out.println("Los elementos oredenados de mayor a menor X " + auxiliar.x + 
                    " Numeros Y " + auxiliar.y);
            
        
        
        
        }
    }
}
        
        
        
        
        
           
        
    
    

