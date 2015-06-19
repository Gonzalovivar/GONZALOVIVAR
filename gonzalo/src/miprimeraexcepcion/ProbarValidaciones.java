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
public class ProbarValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        int edad=20;
        System.out.println("vamos a validar tu edad");
        try{
        
        ValidarEdad.Validar(edad);
        System.out.println("SI TU VEZ NO SE LANZO TU EXECEPTION");
        
        //catch(Exception ex){
        
    }catch (MenordeEdadException ex){
            System.out.println(ex.getMessage());
            
}catch(NumberFormatException ex) {
    
            System.out.println("Metiste lestras y no numero tonto");
}
}
}
