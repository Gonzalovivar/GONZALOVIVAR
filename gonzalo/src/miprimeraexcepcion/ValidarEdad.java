/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

/**
 *
 * @author T-107
 */

//throw lanzar en era pers
public class ValidarEdad {
    public static void Validar(int edad) throws MenordeEdadException{ 
        if (edad <18) throw new MenordeEdadException();
        
        
            
    }
}

