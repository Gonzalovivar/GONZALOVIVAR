/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Animal raro=new Animal();
            raro.setEdad(2);
            raro.setNombre("rareza");*/
        
        /*Tortuga animal1=new Tortuga();
                animal1.setNombre("japonesa");
                animal1.setEdad(12);
        Leon animal2=new Leon();
                animal2.setNombre("Africano");
                animal2.setEdad(20);*/
        pollo p1=new pollo();
        p1.setNombre("pollito pio");
        
         Leon l1=new Leon();
        l1.setNombre("timba");
        
        Leon l2=new Leon();
        l2.setNombre("mu-fa-sa");
        
        Delfin d1=new Delfin();
        d1.setNombre("Flipper");
        
        Tortuga a1=new Tortuga();
        a1.setNombre("japonesa");
        
        ComportamientoRuido animales[]=new ComportamientoRuido[4];
        animales[0]=p1;
        animales[1]=l1;
        animales[2]=l2;
        animales[3]=d1;
        
        for(ComportamientoRuido algo:animales){
           // algo.hacerRuido();
            System.out.println( algo.hacerRuido());
            
            
        }
    }
}


