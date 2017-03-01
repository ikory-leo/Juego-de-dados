/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author labing506
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Grafica miGraf = new Grafica();
        Dado Dadeishon1= new Dado();
        Dado Dadeishon2= new Dado();
       miGraf.dadoOneG = Dadeishon1;
       miGraf.dadoTwoG = Dadeishon2;
       miGraf.setVisible(true);
        // TODO code application logic here
    }
    
}
