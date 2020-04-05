/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLase;

import Interfaces.IA;
import Interfaces.IB;
import Interfaces.IC;

/**
 *
 * @author Herberth
 */
public class CA implements IA,IB,IC, comparable<CA> {
    
    
   public int x,y;
    private int suma;

    public CA() {
        x=0;
        y=0;
        
        
    }

    public CA(int x, int y) {
       this.x=x;
        this.y=y; 
    }

   
    
    public int Suma(){
        return x+y;
        
    }

    public int mayor() {
        return Math.max(x, y);
        
    }

    public int Suma(int c) {
        
       return x + y;
        
    }

    @Override
    public int Multi(int a) {
       return x*y ;
        
    }

    

    public int multi() {
       return x*y;
       
        
    }

    public int sumar() {
       return x+y;
       
        
    }
    public int compareTo(CA t) {
        return x==t.x?1:x>t.x?-1:0;
    }
    
}
