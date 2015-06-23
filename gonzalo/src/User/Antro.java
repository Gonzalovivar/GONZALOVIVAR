/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author T-107
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Direccion d1 = new Direccion(324342,"wffwf") ;
    Usuario u1 = new Usuario(42,"juan","sdcsc@sdcs",d1);
    System.out.println(u1.getDireccion().getMunicipio());
// usuario u = new Usuario(ffwf,323,sdsf,new Direccion(3434."sfdsf"));


    }
}
