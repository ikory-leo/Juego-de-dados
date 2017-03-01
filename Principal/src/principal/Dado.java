/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;

/**
 *
 * @author labing506
 */
public class Dado {
        int numero;
        Random miRam= new Random();
        
        public int Lanzar(){
            do
            {
             numero=miRam.nextInt();
            }while(numero<0 || numero>7); 
            
            return numero;
        }

    
}
