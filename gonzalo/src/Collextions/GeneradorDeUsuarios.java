/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collextions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeUsuarios {
    private List<Usuarios> usuarioss;
    
    public GeneradorDeUsuarios(){
        
        Usuarios u1=new Usuarios("juan",42,"jc@gmail.com");
        Usuarios u2=new Usuarios("ANA",22,"jc@gmail.com");
        Usuarios u3=new Usuarios("pedro",33,"jc@gmail.com");
        Usuarios u4=new Usuarios("pancha",60,"pancha@hot,ail.com");
        
        
        usuarioss=new ArrayList<Usuarios>();
        usuarioss.add(u1);
         usuarioss.add(u2);
          usuarioss.add(u3);
           usuarioss.add(u4);
    }

    public List<Usuarios> getUsuarios() {
        return usuarioss;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarioss = usuarioss;
    }
    
    public String agregarUsuario(String nombre,int edad,String email){
        
        Usuarios u=new Usuarios(nombre,edad,email);
        usuarioss.add(u);
        return "usuario agrgado con exito";
    
    
}

}

