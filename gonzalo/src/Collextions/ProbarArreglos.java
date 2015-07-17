/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collextions;
import java.util.ArrayList;
//import java.util.*;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[] args) {
        
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
        
        generadora.agregarUsuario("chana",18,"chana@yomera.com");
        
        
      
        ArrayList<Usuarios>usuarioss=(ArrayList<Usuarios>)generadora.getUsuarios();
                        System.out.println(usuarioss.size());
                        
              for(Usuarios u:usuarioss){
        System.out.println(u.getNombre()+"edad:"+u.getEdad()+"email:"+u.getEmail());     
    }
}
}