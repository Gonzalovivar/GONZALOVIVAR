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
public class Leon extends Animal implements ComportamientoRuido{

    @Override//tipo de notacion (sobrescritura)override sobrescribe el metodo abstracto que tiene la interfaz
    public String hacerRuido() {
        //tipo de retorno 
        return"grrrruuaar" + ""+ getNombre();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}
